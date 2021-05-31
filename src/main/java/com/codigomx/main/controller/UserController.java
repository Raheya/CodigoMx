package com.codigomx.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codigomx.main.model.User;
import com.codigomx.main.service.IUser;

@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	IUser userService;
	
    // Create a new user
	@PostMapping("/user")
	public ResponseEntity<String> createUser(@RequestBody User user) {
			if(userService.create(user)!=null) {
				return new ResponseEntity<>("User created", HttpStatus.OK);
			}else {
				return new ResponseEntity<>("User creation failed", HttpStatus.BAD_REQUEST);
			}
						
	}
	


}
