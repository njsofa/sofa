/*
 */
package com.wym.osprey.entity;

import java.io.Serializable;

public class ResultData implements Serializable {

	/**
	 */
	private static final long serialVersionUID = 4671841641748732840L;

	/**
	 * 默认成功
	 */
	public static final boolean RESULT_SUCESS = true;

	/**
	 * 校验失败
	 */
	public static final boolean RESULT_FAIL = false;
	/**
	 * 接口返回状态码
	 */
	public static final int RESULT_CODE_SUCCESS = 0; // 成功
	/**
	 * 接口返回状态码
	 */
	public static final int RESULT_CODE_VALIDATE_FAIL = -1; // 失败
	/**
	 * 接口返回状态码
	 */
	public static final int RESULT_CODE_FAIL = -2; // 失败

	/**
	 * 校验通过描述
	 */
	public static final String MSG_VALIDATE_SUCCESS = "校验通过";

	/**
	 * 默认校验不通过描述
	 */
	public static final String MSG_FAILURE = "校验不通过，参数不合法";

	/**
	 * 校验通过描述
	 */
	public static final String MSG_SUCCESS = "成功！";
	/**
	 * 默认校验通过实体
	 */
	private static ResultData successData = new ResultData();

	/**
	 * 默认校验不通过实体
	 */
	private static ResultData failureData = new ResultData(MSG_FAILURE);

	/**
	 * 接口返回是否成功的标志
	 */
	private boolean success = RESULT_SUCESS;

	/**
	 * 校验返回的消息
	 */
	private String msg = MSG_SUCCESS;

	/**
	 * 返回对象
	 */
	private Object result = null;

	/**
	 * 列表总数
	 */
	private int totalCount = 0;

	/**
	 * 公共字段，扩展用
	 */
	private String commonParam;
	/**
	 * 验证结果
	 */
	private int validateResult = RESULT_CODE_SUCCESS;

	/**
	 * 通用返回码
	 */
	private String code;
	
	public ResultData() {

	}

	public ResultData(String msg) {
		// this.result = RESULT_FAILURE;
		this.msg = msg;
	}

	public ResultData(String msg, int code, boolean successFlag) {
		this.msg = msg;
		this.validateResult = code;
		this.success = successFlag;

	}

	public ResultData(String msg, int code, Object result) {
		this.msg = msg;
		this.validateResult = code;
		this.result = result;
	}

	public Object getResult() {
		return result;
	}

	public void setResult(Object result) {
		this.result = result;
	}

	/**
	 * 
	 * @return
	 */
	public boolean getSuccess() {
		return success;
	}

	/**
	 * 
	 * @param success
	 */
	public void setSuccess(boolean success) {
		this.success = success;
	}

	/**
	 * @return 返回 msg
	 */
	public String getMsg() {
		return msg;
	}

	/**
	 * @param msg 对msg进行赋值
	 */
	public void setMsg(String msg) {
		this.msg = msg;
	}

	/**
	 * @return 返回 validateResult
	 */
	public int getValidateResult() {
		return validateResult;
	}

	/**
	 * @param validateResult 对validateResult进行赋值
	 */
	public void setValidateResult(int validateResult) {
		this.validateResult = validateResult;
	}

	public boolean isValidatePass() {
		if (this.validateResult != RESULT_CODE_SUCCESS) {
			return false;
		}
		return true;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public String getCommonParam() {
		return commonParam;
	}

	public void setCommonParam(String commonParam) {
		this.commonParam = commonParam;
	}

	public static ResultData getSuccessData() {
		return successData;
	}

	public static void setSuccessData(ResultData successData) {
		ResultData.successData = successData;
	}

	public static ResultData getFailureData() {
		return failureData;
	}

	public static void setFailureData(ResultData failureData) {
		ResultData.failureData = failureData;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
}
