package com.codigomx.main.service;

import org.springframework.stereotype.Service;

import com.codigomx.main.model.User;

@Service
public interface IUser {
	
	public User create(User user);

}
