package com.alok.di.service;

public class SMSServiceImpl implements MessageService {

	@Override
	public void sendMessage(String msg, String rcv) {
		System.out.println("SMS sent to "+rcv+ " with Message="+msg);
		
	}

}
