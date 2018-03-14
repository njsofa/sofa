package com.sofa.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sofa.mapper.JourneyInfoMapper;
import com.sofa.model.JourneyInfo;
import com.sofa.service.JourneyInfoService;

@Service
public class JourneyInfoServiceImpl implements JourneyInfoService {
    @Autowired
    private JourneyInfoMapper journeyInfoMapper;
 
	@Override
	public JourneyInfo selectById(String id) {
		return journeyInfoMapper.selectById(id);
	}
}
