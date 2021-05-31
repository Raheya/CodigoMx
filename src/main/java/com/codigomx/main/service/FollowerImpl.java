package com.codigomx.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codigomx.main.model.Followers;
import com.codigomx.main.repository.FollowerRepository;

@Service
public class FollowerImpl implements IFollower{
	
	@Autowired
	FollowerRepository followerRepository;

	@Override
	public Followers follow(Followers follower) {
		return followerRepository.save(follower);
	}




}
