package com.codigomx.main.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.codigomx.main.model.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long>{
	
	@Query(value ="select p.content from post p join followers f on f.follower_id = p.user_id where f.follower_id =:followerId and f.follow_id =:followId")
	Collection<Post> findPosts(int followerId, int followId);
	

}
