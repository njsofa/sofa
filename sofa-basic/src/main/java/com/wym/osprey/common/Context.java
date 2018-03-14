package com.wym.osprey.common;

import com.wym.osprey.entity.AuthInfo;

/**
 * 应用上下文
 * @author Administrator
 *
 */
public class Context {

	protected static ThreadLocal<AuthInfo> authInfoThreadLocal = new ThreadLocal<AuthInfo>();

	protected static ThreadLocal<String> instCodeThreadLocal = new ThreadLocal<>();

	/**
	 * 设置当前线程的机构代码
	 * @param instCode
	 */
	public static void setInstCode(String instCode) {
		instCodeThreadLocal.set(instCode);
	}

	/**
	 * 获取当前线程的机构代码
	 * @return
	 */
	public static String getInstCode() {
		String instCode = instCodeThreadLocal.get();
		if (instCode == null) {
			AuthInfo authInfo = Context.getAuthInfo();
			if (authInfo != null) {
				instCode = authInfo.getCode();
				instCodeThreadLocal.set(instCode);
			}
		}
		return instCode;
	}

	/**
	 * 保存登录用户信息
	 * @param authInfo
	 */
	public static void setAuthInfo(AuthInfo authInfo) {
		authInfoThreadLocal.set(authInfo);
	}
	/**
	 * 获取登录用户信息
	 * @return
	 */
	public static AuthInfo getAuthInfo() {
		return authInfoThreadLocal.get();
	}
}
