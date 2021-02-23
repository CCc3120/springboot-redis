package com.bingo.redis.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.bingo.redis.model.User;

public interface UserRepository extends JpaRepository<User, String>, JpaSpecificationExecutor<User> {

}
