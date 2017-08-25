package com.futureBacken.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.futureBacken.dao.UserDao;
import com.futureBacken.model.User;
import com.futureBacken.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Override
	public void save(User user) {
		userDao.save(user);
	}

	@Override
	public User findByUsername(String name) {
		return userDao.findByUsername(name);
	}

}
