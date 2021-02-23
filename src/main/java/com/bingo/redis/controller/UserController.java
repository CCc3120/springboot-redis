package com.bingo.redis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bingo.redis.service.spring.UserServiceImpl;
import com.bingo.redis.util.RedisUtil;

@RestController
@RequestMapping(value = "/user")
public class UserController {

	@Autowired
	private RedisUtil redisUtil;

	@Autowired
	private UserServiceImpl userServiceImpl;

	@RequestMapping(value = "/set")
	public boolean redisSet(String key, String value) {
		System.out.println("存值====>>>>");

		return redisUtil.set(key, value);
	}

	@RequestMapping(value = "/get")
	public Object redisGet(String key, String flag) {
		// User user = new User();
		// // user.setId("1qw23e");
		// user.setAge("23");
		// user.setCreateTime(new Date());
		// user.setName("张三");
		// user.setGuid("zxascv");
		// userServiceImpl.save(user);

		// System.out.println(redisUtil.get("user--4028820f73366d2f0173366d53b60000"));
		if (flag.equals("t")) {
			userServiceImpl.delete(key);
		} else {
			System.out.println(userServiceImpl.findByKey(key));
		}
		return "ok";
	}

}
