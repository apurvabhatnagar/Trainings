package com.example.Assignment1;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class PrintBeans implements ApplicationContextAware {

	private ApplicationContext applicationContext; 
	
	public ApplicationContext getApplicationContext() {
		return applicationContext;
	}
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		this.applicationContext = applicationContext;
	}

}
