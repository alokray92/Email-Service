package com.alok.di.service;

public class EmailServiceImpl implements MessageService {

	@Override
	public void sendMessage(String msg, String rcv) {
		System.out.println("Email sent to "+rcv+ " with Message="+msg);
		
	}

}
