package com.codigomx.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codigomx.main.model.Followers;
import com.codigomx.main.model.User;
import com.codigomx.main.service.IFollower;
import com.codigomx.main.service.IUser;

@RestController
@RequestMapping("/api")
public class FollowerController {
	
	@Autowired
	IFollower followerService;

	
    // Create a new user
	@PostMapping("/follow")
	public ResponseEntity<String> createUser(@RequestBody Followers follower) {
			if(followerService.follow(follower)!=null) {
				return new ResponseEntity<>("Following", HttpStatus.OK);
			}else {
				return new ResponseEntity<>("Follow failed", HttpStatus.BAD_REQUEST);
			}
						
	}
}
