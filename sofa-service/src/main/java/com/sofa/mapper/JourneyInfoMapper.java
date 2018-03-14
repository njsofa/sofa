package com.sofa.mapper;

import org.apache.ibatis.annotations.Param;

import com.sofa.model.JourneyInfo;

public interface JourneyInfoMapper {
	public JourneyInfo selectById(@Param("id")String id);
}