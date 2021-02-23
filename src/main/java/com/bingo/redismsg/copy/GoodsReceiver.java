package com.bingo.redismsg.copy;

import com.alibaba.fastjson.JSON;

public class GoodsReceiver extends AbstractReceiver {

	@Override
	public void receiveMessage(Object message) {
		System.out.println("接收到商品消息：redis" + JSON.toJSONString(message));

	}

}
