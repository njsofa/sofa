package com.wym.osprey.common;

import org.apache.commons.lang3.StringUtils;

public enum CodeMessageEnum {

	MESSAGE_AUTH_PATHNOTOKEN("MSGAUTH0000","前端没有传token过来"),
	MESSAGE_AUTH_CASSERVERNOTOKEN("MSGAUTH0001","权限中无此token"),
	MESSAGE_AUTH_TOKENEXPIRED("MSGAUTH0002","登录时间已失效"),
	MESSAGE_AUTH_BASICINFOWRONG("MSGAUTH0003","基本信息错误"),
	MESSAGE_AUTH_JWTDATAERROR("MSGAUTH0004","JWT数据格式错误"),
	MESSAGE_AUTH_REDISERROR("MSGAUTH0005","REDIS异常"),
	MESSAGE_AUTH_NOREPORTAUTH("MSGAUTH0006","登录用户无权限查看报表");
	
	private String code;
	private String message;
	private CodeMessageEnum(String code, String message) {
		this.code = code;
		this.message = message;
	}
	public static String getMsgByCode(String code) {
		CodeMessageEnum[] values = CodeMessageEnum.values();
		for(CodeMessageEnum enums :values) {
			if(StringUtils.equals(code, enums.getCode())) {
				return enums.getMessage();
			}
		}
		
		return null;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
