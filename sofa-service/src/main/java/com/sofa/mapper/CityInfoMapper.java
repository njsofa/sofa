package com.sofa.mapper;

import com.sofa.model.CityInfo;
import com.sofa.model.CityInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CityInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table common_city_info
     *
     * @mbggenerated Wed Mar 14 10:41:03 CST 2018
     */
    int countByExample(CityInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table common_city_info
     *
     * @mbggenerated Wed Mar 14 10:41:03 CST 2018
     */
    int deleteByExample(CityInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table common_city_info
     *
     * @mbggenerated Wed Mar 14 10:41:03 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table common_city_info
     *
     * @mbggenerated Wed Mar 14 10:41:03 CST 2018
     */
    int insert(CityInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table common_city_info
     *
     * @mbggenerated Wed Mar 14 10:41:03 CST 2018
     */
    int insertSelective(CityInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table common_city_info
     *
     * @mbggenerated Wed Mar 14 10:41:03 CST 2018
     */
    List<CityInfo> selectByExample(CityInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table common_city_info
     *
     * @mbggenerated Wed Mar 14 10:41:03 CST 2018
     */
    CityInfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table common_city_info
     *
     * @mbggenerated Wed Mar 14 10:41:03 CST 2018
     */
    int updateByExampleSelective(@Param("record") CityInfo record, @Param("example") CityInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table common_city_info
     *
     * @mbggenerated Wed Mar 14 10:41:03 CST 2018
     */
    int updateByExample(@Param("record") CityInfo record, @Param("example") CityInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table common_city_info
     *
     * @mbggenerated Wed Mar 14 10:41:03 CST 2018
     */
    int updateByPrimaryKeySelective(CityInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table common_city_info
     *
     * @mbggenerated Wed Mar 14 10:41:03 CST 2018
     */
    int updateByPrimaryKey(CityInfo record);
}