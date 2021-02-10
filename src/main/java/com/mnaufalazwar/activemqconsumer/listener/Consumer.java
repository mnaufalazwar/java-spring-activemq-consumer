package com.mnaufalazwar.activemqconsumer.listener;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {
	
	@JmsListener(destination="standalone.queue")
	public void consume(String message) {
		
//		try
//		{
//		    Thread.sleep(5000);
//		}
//		catch(InterruptedException ex)
//		{
//		    Thread.currentThread().interrupt();
//		}
		
		System.out.println("Message Received!");
		System.out.println(message);
	}

}
