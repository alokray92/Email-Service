package com.alok.di.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.alok.di.consumer.Consumer;
import com.alok.di.consumer.MyDIApplication;
import com.alok.di.injector.MessageServiceInjector;
import com.alok.di.service.MessageService;

public class MyDIApplicationJUnitTest {
	private MessageServiceInjector injector;
	
	@Before
	public void setUp(){
		injector=new MessageServiceInjector(){

			@Override
			public Consumer getConsumer() {
				return new MyDIApplication(new MessageService(){
					@Override
					public void sendMessage(String msg, String rec) {
						System.out.println("Mock Message Service implementation");
					}
				});
			}
		};
	}
	@Test
	public void test() {
		Consumer consumer = injector.getConsumer();
		consumer.processMessage("Hi Pankaj", "pankaj@abc.com");
	}
	@After
	public void tear(){
		injector = null;
	}
}
