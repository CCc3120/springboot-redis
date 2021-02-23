package com.bingo.activemq;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class QueueConsumerListener {
	// queue模式的消费者
	@JmsListener(destination = "${spring.activemq.queue-name}", containerFactory = "queueListener")
	public void readActiveQueue(String message) {
		System.out.println("queue接受到redis：" + message);
	}
}
