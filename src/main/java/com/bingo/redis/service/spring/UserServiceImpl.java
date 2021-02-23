package com.bingo.redis.service.spring;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bingo.redis.dao.UserRepository;
import com.bingo.redis.model.User;
import com.bingo.redis.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	// @CacheEvict(value = "user", keyGenerator = "keyGenerator", allEntries =
	// true)
	@CachePut(value = "user", key = "#user.id")
	public User save(User user) {
		return userRepository.save(user);
	}

	@Override
	@Cacheable(value = "user", key = "#id")
	public User findByKey(String id) {
		Optional<User> user = userRepository.findById(id);
		return user.isPresent() ? user.get() : null;
	}

	@Override
	@CachePut(value = "user", key = "#user.id")
	public User update(User user) {
		return userRepository.save(user);
	}

	@Override
	// , beforeInvocation = true
	@CacheEvict(value = "user", allEntries = true)
	public void delete(String id) {
		userRepository.deleteById(id);
	}

}
