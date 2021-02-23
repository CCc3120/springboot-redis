package com.bingo.redis.service;

import com.bingo.redis.model.User;

public interface UserService {

	public User save(User user);

	public User findByKey(String id);

	public User update(User user);

	public void delete(String id);

}
