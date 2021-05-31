package com.codigomx.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codigomx.main.model.User;
import com.codigomx.main.repository.UserRepository;

@Service
public class UserImpl implements IUser{
	
	@Autowired
	UserRepository userRepository;

	@Override
	public User create(User user) {
		return userRepository.save(user);	
	}

}
