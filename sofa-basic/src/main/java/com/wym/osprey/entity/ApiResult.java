package com.wym.osprey.entity;

import java.io.Serializable;

public class ApiResult implements Serializable {
    public static final ApiResult SUCCESS = new ApiResult("0", "操作成功！", true);

    public static final ApiResult FAILURE_ARGS_EMPTY = new ApiResult("-100", "操作失败，必填参数不允许为空！", true);

    public static final ApiResult FAILURE_ARGS_FORMAT = new ApiResult("-101", "操作失败，参数格式错误！", true);

    public static final ApiResult FAILURE_DATA_NONE = new ApiResult("-102", "操作失败，数据不存在！", true);

    public static final ApiResult FAILURE_DATA_MISMATCH = new ApiResult("-103", "操作失败，数据不匹配！", true);

    public static final ApiResult FAILURE_DATA_DUPLICATE = new ApiResult("-104", "操作失败，数据重复！", true);

    public static final ApiResult WECHAT_FAILURE = new ApiResult("-400", "调用微信端失败", true);

    public static final ApiResult WECHAT_USER_NOT_AUTHORIZE = new ApiResult("-401", "用户未登录！", true);

    public static final ApiResult EXCEPTION = new ApiResult("-1", "操作失败，服务器出现异常！", true);

    public static final ApiResult FAILURE_ARGS_CHECK = new ApiResult("-2", "操作失败，参数校验未通过！", true);

    public static final ApiResult FAILURE_TIMEOUT = new ApiResult("-3", "操作超时失败！", true);

    public static final ApiResult UNKNOWN = new ApiResult("-9", "操作失败，未知错误！", true);

    private String code;

    private String msg;

    private Object data;

    /**
	 * 接口返回是否成功的标志
	 */
	private boolean success = true;
    private final boolean immutable; // 表示该对象不可变
	
    public static ApiResult create(ApiResult apiResult, Object data) {
        return create(apiResult.code, apiResult.msg, data);
    }

    public static ApiResult create(String code, String msg) {
        return new ApiResult(code, msg);
    }

    public static ApiResult create(String code, String msg, Object data) {
        ApiResult result = new ApiResult(code, msg);
        result.data = data;
        return result;
    }

    private ApiResult(String code, String msg) {
        this(code, msg, false);
    }
 
    private ApiResult(String code, String msg, boolean immutable) {
        this.code = code;
        this.msg = msg;
        this.immutable = immutable;
    }

    public ApiResult appendData(Object data) {
        ApiResult apiResult = this.immutable ? new ApiResult(this.code, this.msg) : this;
        apiResult.data = data;
        apiResult.success = true;
        return apiResult;
    }

    public ApiResult appendMsg(String msg) {
        ApiResult apiResult = null;
        if (this.immutable) {
            apiResult = new ApiResult(this.code, msg);
            apiResult.data = this.data;
        }
        else {
            apiResult = this;
            apiResult.msg = msg;
        }

        return apiResult;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }

        if (object == null || !(object instanceof ApiResult)) {
            return false;
        }

        return this.code.equals(((ApiResult)object).code);
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public Object getData() {
        return data;
    }

	public boolean isSuccess() {
		return success;
	}
    
}
