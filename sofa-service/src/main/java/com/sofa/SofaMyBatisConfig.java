package com.sofa;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import net.sf.log4jdbc.Log4jdbcProxyDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * 报表模块（非机构模块）的Mybatis配置
 * <p>读取com.codedocker.report.mapper 包下的mapper类</p>
 * <p>实现类的xml格式文件存放在classpath:mapper.report下</p>
 *
 * @author zhangyutao
 */
@Configuration()
@MapperScan(value = "com.sofa.mapper", sqlSessionFactoryRef = "sqlSessionFactory")
@EnableTransactionManagement
public class SofaMyBatisConfig {

    private static final Logger logger = LoggerFactory.getLogger(SofaMyBatisConfig.class);

    @Value("${spring.datasource.druid.max-active}")
    private Integer maxActive;
    @Value("${spring.datasource.druid.initial-size}")
    private Integer initialSize;
    @Value("${spring.datasource.druid.min-idle}")
    private Integer minIdle;
    @Value("${spring.datasource.druid.test-on-borrow}")
    private boolean testOnBorrow;
    @Value("${spring.datasource.druid.test-while-idle}")
    private boolean testWhileIdle;
    @Value("${spring.datasource.druid.time-between-eviction-runs-millis}")
    private long timeBetweenEvictionRunsMillis; 
    @Value("${spring.datasource.druid.min-evictable-idle-time-millis}")
    private long minEvictableIdleTimeMillis;
    
    @Bean(name = "dataSource")
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource dataSource() {
        DruidDataSource druidDataSource = DruidDataSourceBuilder.create().build();
        druidDataSource.setMaxActive(maxActive);
        druidDataSource.setInitialSize(initialSize);
        druidDataSource.setMinIdle(minIdle);
        druidDataSource.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);
        druidDataSource.setTestOnBorrow(testOnBorrow);
        druidDataSource.setTestWhileIdle(testWhileIdle);
        druidDataSource.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis);

        Log4jdbcProxyDataSource dataSource = new Log4jdbcProxyDataSource();
        dataSource.setDataSource(druidDataSource);
        dataSource.setDumpSqlMaxLineLength(0);
        return dataSource;
    }


    @Bean("transactionManager")
    public PlatformTransactionManager txManager(@Qualifier("dataSource") DataSource dataSource) {
        DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager(dataSource);
        return dataSourceTransactionManager;
    }

    @Bean("sqlSessionFactory")
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        logger.info("========================in MyBatisConfig========================");
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource());
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        sessionFactory.setMapperLocations(resolver.getResources("classpath*:/mapper/sofa/*.xml"));
        sessionFactory.setTypeAliasesPackage("com.sofa.model");
        return sessionFactory.getObject();
    }
}
