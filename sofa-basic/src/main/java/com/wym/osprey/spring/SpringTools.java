package com.wym.osprey.spring;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.concurrent.CountDownLatch;

/**
 * 
 * @author a
 *
 */
@Component("springTools")
public class SpringTools implements ApplicationContextAware  {
	private static volatile ApplicationContext applicationContext;

	private static CountDownLatch countDownLatch;

	static {
		countDownLatch = new CountDownLatch(1);
	}

	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		applicationContext = arg0;
		countDownLatch.countDown();
	}

	/**
	 * 获取bean
	 * @param name
	 * @return
	 */
	public static Object getBeanByName(String name){
		ApplicationContext context = getApplicationContext();
		return context.getBean(name);
	}

	/**
	 * 获取Bean
	 * @param className
	 * @param clazz
	 * @param <T>
	 * @return
	 */
	public static <T> T getBeanByName(String className, Class<T> clazz) {
		ApplicationContext context = getApplicationContext();
		return context.getBean(className, clazz);
	}

	private static ApplicationContext getApplicationContext() {
		if (null == applicationContext){
			try {
				countDownLatch.await();
			}
			catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}
		return applicationContext;
	}
}
