package com.bingo.redismsg;

//@Component
public class RedisReceiver {
	public void receiveMessage(String message) {
		System.out.println("消息来了：" + message);
	}
}
