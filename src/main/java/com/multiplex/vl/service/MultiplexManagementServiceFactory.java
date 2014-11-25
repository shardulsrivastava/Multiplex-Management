package com.multiplex.vl.service;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class MultiplexManagementServiceFactory implements
		ApplicationContextAware {

	/** The context. */
	private ApplicationContext context = null;

	@Override
	public void setApplicationContext(ApplicationContext ctx)
			throws BeansException {
		// TODO Auto-generated method stub

		this.context = ctx;

	}

	/**
	 * This method returns the service that has been looked upon, fetching it
	 * from the application context.
	 * 
	 * @param serviceName
	 *            the service name
	 * @return ContactService - Contract for all services
	 */
	public MultiplexBaseService getServiceInstance(String serviceName) {

		return (MultiplexBaseService) context.getBean(serviceName);
	}

}
