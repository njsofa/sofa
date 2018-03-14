package com.wym.osprey.throwable;

import com.wym.osprey.entity.ApiResult;

public class BizException extends RuntimeException {
    private ApiResult apiResult;

    public BizException(String msg) {
        this(ApiResult.UNKNOWN.appendMsg(msg));
    }

    public BizException(ApiResult apiResult) {
        super(apiResult.getMsg());
        this.apiResult = apiResult;
    }

    public BizException(ApiResult apiResult, String msg) {
        this(apiResult.appendMsg(msg));
    }

    public ApiResult getApiResult() {
        return apiResult;
    }

    public void setApiResult(ApiResult apiResult) {
        this.apiResult = apiResult;
    }
}
