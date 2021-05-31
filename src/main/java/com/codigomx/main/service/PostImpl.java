package com.codigomx.main.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codigomx.main.model.Post;
import com.codigomx.main.repository.PostRepository;

@Service
public class PostImpl implements IPost{
	
	@Autowired
	PostRepository postRepository;

	@Override
	public Post create(Post post) {
		return postRepository.save(post);
	}

	@Override
	public Collection<Post> getPosts(int followerId, int followId) {
		return postRepository.findPosts(followerId, followId);
	}

}
