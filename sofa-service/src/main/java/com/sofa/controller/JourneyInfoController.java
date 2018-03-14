package com.sofa.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sofa.controller.param.IdParam;
import com.sofa.model.JourneyInfo;
import com.sofa.service.JourneyInfoService;
import com.wym.osprey.entity.ApiResult;

/**
 * 会员信息Controller
 */
@Controller
@RequestMapping("/api/journey/")
public class JourneyInfoController extends AbstractController {
    private static final Logger logger = LoggerFactory.getLogger(JourneyInfoController.class);

    @Autowired
    private JourneyInfoService journeyInfoService; 

    @PostMapping(value = "queryById", consumes = "application/json")
    @ResponseBody
    public ApiResult queryById(@RequestBody IdParam params, HttpServletRequest request) {
        try {
        	JourneyInfo journeyInfo = journeyInfoService.selectById(params.getId());
            return ApiResult.SUCCESS.appendData(journeyInfo);
        }
        catch (Exception ex) {
            return ApiResult.EXCEPTION;
        }
    }
}
