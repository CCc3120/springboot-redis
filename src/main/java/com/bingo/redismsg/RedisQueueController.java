package com.bingo.redismsg;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/redis")
public class RedisQueueController {

	@Autowired
	private RedisTemplate<String, Object> template;

	@RequestMapping(value = "/syncmessage")
	public String SyncMessage() {
		for (int i = 1; i <= 3; i++) {
			try {
				// 为了模拟消息，sleep一下。
				Thread.sleep(2000);
			} catch (InterruptedException ex) {
			}
			template.convertAndSend("channel:test", String.format("我是消息{%d}号: %tT", i, new Date()));
		}

		return "success";
	}
}
