package com.codigomx.main.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codigomx.main.model.Post;
import com.codigomx.main.service.IPost;

@RestController
@RequestMapping("/api")
public class PostController {
	
	@Autowired
	IPost postService;
	
    // Create a new a post
	@PostMapping("/createPost")
	public ResponseEntity<String> createPost(@RequestBody Post post) {
			if(postService.create(post)!=null) {
				return new ResponseEntity<>("Post created", HttpStatus.OK);
			}else {
				return new ResponseEntity<>("Post creation failed", HttpStatus.BAD_REQUEST);
			}
						
	}
	
	@GetMapping("/getPosts/{follower_id}/{follow_id}")
	public Collection<Post> getNoteById(@PathVariable(value = "follower_id") int followerId, @PathVariable(value = "follow_id") int followId) {
		return postService.getPosts(followerId,followId);
	}
}
