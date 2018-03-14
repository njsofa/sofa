package com.sofa.service;

import com.sofa.model.JourneyInfo;

public interface JourneyInfoService {
    /**
     * 根据优惠券ID查询
     * @param siteCode
     * @param couponInfoId
     * @return
     */
	JourneyInfo selectById(String id);
}
