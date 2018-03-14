package com.wym.osprey.redis;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import redis.clients.jedis.JedisPoolConfig;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

@Service
public class RedisTemplateManager implements InitializingBean {
	private static Logger logger = LoggerFactory.getLogger(RedisTemplateManager.class);
	
	@Value("${redistemplate-token.hostName}")
	private String hostNameTokenRedis;
	@Value("${redistemplate-token.password}")
	private String passwordTokenRedis;
	@Value("${redistemplate-token.port}")
	private Integer portTokenRedis;
	@Value("${redistemplate-token.maxIdle}")
	private Integer maxIdleTokenRedis;
	@Value("${redistemplate-token.maxTotal}")
	private int maxTotalTokenRedis;
	@Value("${redistemplate-token.index}")
	private int indexTokenRedis;  
	@Value("${redistemplate-token.maxWaitMillis}")
	private long maxWaitMillisTokenRedis;
	@Value("${redistemplate-token.testOnBorrow}")
	private boolean testOnBorrowTokenRedis;
	
	@Value("${redistemplate.hostName}")
	private String hostNameRedis;
	@Value("${redistemplate.password}")
	private String passwordRedis;
	@Value("${redistemplate.port}")
	private Integer portRedis;
	@Value("${redistemplate.maxIdle}")
	private Integer maxIdleRedis;
	@Value("${redistemplate.maxTotal}")
	private int maxTotalRedis;
	@Value("${redistemplate.index}")
	private int indexRedis;  
	@Value("${redistemplate.maxWaitMillis}")
	private long maxWaitMillisRedis;
	@Value("${redistemplate.testOnBorrow}")
	private boolean testOnBorrowRedis;
	
	
	@Value("${redistemplate-role.hostName}")
	private String hostNameRoleRedis;
	@Value("${redistemplate-role.password}")
	private String passwordRoleRedis;
	@Value("${redistemplate-role.port}")
	private Integer portRoleRedis;
	@Value("${redistemplate-role.maxIdle}")
	private Integer maxIdleRoleRedis;
	@Value("${redistemplate-role.maxTotal}")
	private int maxTotalRoleRedis;
	@Value("${redistemplate-role.index}")
	private int indexRoleRedis;  
	@Value("${redistemplate-role.maxWaitMillis}")
	private long maxWaitMillisRoleRedis;
	@Value("${redistemplate-role.testOnBorrow}")
	private boolean testOnBorrowRoleRedis;
	
	public final static String REDIS_DBNAME_TOKEN = "token";
	public final static String REDIS_DBNAME_BUS = "bus";
	public final static String REDIS_DBNAME_DEFAULT = "default";
	/**
	 * ACM 控制台配置的所有机构码，逗号分隔
	 * 如：23,92,50
	 * 机构码和数据源信息需要一一对应
	 */
	public static String REPORT_ORG_LIST_KEY = "report.org.list";
	
	final static ReentrantLock lock = new ReentrantLock();
	 
	
	public static Map<String, RedisTemplate<String, String>> redisTemplateMap = new HashMap<String, RedisTemplate<String, String>>();
	
	public static RedisTemplate<String, String> getRedisTemplate(String dbname) {
		return redisTemplateMap.get(dbname);
	}
	 
	
	private void createRedisTemplate() {
		if(StringUtils.isNotBlank(hostNameTokenRedis)) {
			StringRedisTemplate temple = new StringRedisTemplate();  
	        temple.setConnectionFactory(connectionFactory(hostNameTokenRedis, portTokenRedis, passwordTokenRedis,  
	                maxIdleTokenRedis, maxTotalTokenRedis, indexTokenRedis, maxWaitMillisTokenRedis, testOnBorrowTokenRedis));  
	        temple.afterPropertiesSet();
	        redisTemplateMap.put(REDIS_DBNAME_TOKEN, temple);
		}
		
		if(StringUtils.isNotBlank(hostNameRoleRedis)) {
			StringRedisTemplate temple = new StringRedisTemplate();  
	        temple.setConnectionFactory(connectionFactory(hostNameRoleRedis, portRoleRedis, passwordRoleRedis,  
	                maxIdleRoleRedis, maxTotalRoleRedis, indexRoleRedis, maxWaitMillisRoleRedis, testOnBorrowRoleRedis));  
	        temple.afterPropertiesSet();
	        redisTemplateMap.put(REDIS_DBNAME_BUS, temple);
	        
		}
		
		if(StringUtils.isNotBlank(hostNameRedis)) {
			StringRedisTemplate temple = new StringRedisTemplate();  
	        temple.setConnectionFactory(connectionFactory(hostNameRedis, portRedis, passwordRedis,  
	                maxIdleRedis, maxTotalRedis, indexRedis, maxWaitMillisRedis, testOnBorrowRedis));  
	        temple.afterPropertiesSet();
	        redisTemplateMap.put(REDIS_DBNAME_DEFAULT, temple);
	        
		}
	}
	
	public RedisConnectionFactory connectionFactory(String hostName, int port,  
            String password, int maxIdle, int maxTotal, int index,  
            long maxWaitMillis, boolean testOnBorrow) {  
        JedisConnectionFactory jedis = new JedisConnectionFactory();  
        jedis.setHostName(hostName);  
        jedis.setPort(port);  
        if (!StringUtils.isEmpty(password)) {  
            jedis.setPassword(password);  
        }  
        if (index != 0) {  
            jedis.setDatabase(index);  
        }  
        jedis.setPoolConfig(poolCofig(maxIdle, maxTotal, maxWaitMillis,  
                testOnBorrow));  
        // 初始化连接pool  
        jedis.afterPropertiesSet();  
        RedisConnectionFactory factory = jedis;  
  
        return factory;  
    }  
	
	public JedisPoolConfig poolCofig(int maxIdle, int maxTotal,  
            long maxWaitMillis, boolean testOnBorrow) {  
        JedisPoolConfig poolCofig = new JedisPoolConfig();  
        poolCofig.setMaxIdle(maxIdle);  
        poolCofig.setMaxTotal(maxTotal);  
        poolCofig.setMaxWaitMillis(maxWaitMillis);  
        return poolCofig;  
    }  
	private void initRedisTemplate(String ...dbnames) {
		try{
			lock.lock();
//			for(String dbname : dbnames) {
//				this.createRedisTemplate(dbname);
//			}
			
			createRedisTemplate();
		}catch(Exception e) {
			logger.error("RedisTemplateManager.initRedisTemplate 初始化redis时发生异常,redis.dbnames="+dbnames+" 异常= "+e.getMessage());
		}finally {
			lock.unlock();
		}
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		this.initRedisTemplate("token","bus");
	}
}
