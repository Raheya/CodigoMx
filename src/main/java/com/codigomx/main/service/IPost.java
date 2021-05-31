package com.codigomx.main.service;

import java.util.Collection;

import org.springframework.stereotype.Service;

import com.codigomx.main.model.Post;

@Service
public interface IPost {
	
	public Post create(Post post);
	public Collection<Post> getPosts(int followerId, int followId);

}
