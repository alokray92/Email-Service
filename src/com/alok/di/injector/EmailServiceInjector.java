package com.alok.di.injector;

import com.alok.di.consumer.Consumer;
import com.alok.di.consumer.MyDIApplication;
import com.alok.di.service.EmailServiceImpl;

public class EmailServiceInjector implements MessageServiceInjector {

	@Override
	public Consumer getConsumer() {
		return new MyDIApplication(new  EmailServiceImpl());
	}

}
