package com.alok.di.test;

import com.alok.di.consumer.Consumer;
import com.alok.di.injector.EmailServiceInjector;
import com.alok.di.injector.MessageServiceInjector;
import com.alok.di.injector.SMSServiceInjector;

public class MyMessageDITest {
	public static void main(String[] args) {
		String msg = "Hi Alok";
		String email = "alokray92@gmail.com";
		String phone = "8374308618";	
		MessageServiceInjector injector = null;
		Consumer app = null;
		//Send email
		injector = new EmailServiceInjector();
		injector.getConsumer().processMessage(msg, email);
		injector = new SMSServiceInjector();
		injector.getConsumer().processMessage(msg, phone);
	}
}
