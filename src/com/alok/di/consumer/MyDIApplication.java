package com.alok.di.consumer;

import com.alok.di.service.MessageService;

public class MyDIApplication implements Consumer {
	private MessageService service;

	public MyDIApplication(MessageService svc) {
		this.service = svc;
	}

	@Override
	public void processMessage(String msg, String rcv) {
		this.service.sendMessage(msg, rcv);
	}

}
