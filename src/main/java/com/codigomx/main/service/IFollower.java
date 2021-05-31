package com.codigomx.main.service;

import org.springframework.stereotype.Service;

import com.codigomx.main.model.Followers;

@Service
public interface IFollower {
	
	public Followers follow(Followers follower);

}
