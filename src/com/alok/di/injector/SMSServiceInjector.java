package com.alok.di.injector;

import com.alok.di.consumer.Consumer;
import com.alok.di.consumer.MyDIApplication;
import com.alok.di.service.SMSServiceImpl;

public class SMSServiceInjector implements MessageServiceInjector {

	@Override
	public Consumer getConsumer() {
		return new MyDIApplication(new SMSServiceImpl());
	}

}
