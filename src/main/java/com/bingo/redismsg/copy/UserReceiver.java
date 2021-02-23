package com.bingo.redismsg.copy;

import com.alibaba.fastjson.JSON;

public class UserReceiver extends AbstractReceiver {

	@Override
	public void receiveMessage(Object message) {
		System.out.println("接收到用户消息：redis" + JSON.toJSONString(message));

	}

}
