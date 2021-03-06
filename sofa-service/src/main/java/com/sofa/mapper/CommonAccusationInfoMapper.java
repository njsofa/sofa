package com.sofa.mapper;

import com.sofa.model.CommonAccusationInfo;
import com.sofa.model.CommonAccusationInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommonAccusationInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table common_accusation_info
     *
     * @mbggenerated Wed Mar 14 10:41:03 CST 2018
     */
    int countByExample(CommonAccusationInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table common_accusation_info
     *
     * @mbggenerated Wed Mar 14 10:41:03 CST 2018
     */
    int deleteByExample(CommonAccusationInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table common_accusation_info
     *
     * @mbggenerated Wed Mar 14 10:41:03 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table common_accusation_info
     *
     * @mbggenerated Wed Mar 14 10:41:03 CST 2018
     */
    int insert(CommonAccusationInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table common_accusation_info
     *
     * @mbggenerated Wed Mar 14 10:41:03 CST 2018
     */
    int insertSelective(CommonAccusationInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table common_accusation_info
     *
     * @mbggenerated Wed Mar 14 10:41:03 CST 2018
     */
    List<CommonAccusationInfo> selectByExample(CommonAccusationInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table common_accusation_info
     *
     * @mbggenerated Wed Mar 14 10:41:03 CST 2018
     */
    CommonAccusationInfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table common_accusation_info
     *
     * @mbggenerated Wed Mar 14 10:41:03 CST 2018
     */
    int updateByExampleSelective(@Param("record") CommonAccusationInfo record, @Param("example") CommonAccusationInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table common_accusation_info
     *
     * @mbggenerated Wed Mar 14 10:41:03 CST 2018
     */
    int updateByExample(@Param("record") CommonAccusationInfo record, @Param("example") CommonAccusationInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table common_accusation_info
     *
     * @mbggenerated Wed Mar 14 10:41:03 CST 2018
     */
    int updateByPrimaryKeySelective(CommonAccusationInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table common_accusation_info
     *
     * @mbggenerated Wed Mar 14 10:41:03 CST 2018
     */
    int updateByPrimaryKey(CommonAccusationInfo record);
}