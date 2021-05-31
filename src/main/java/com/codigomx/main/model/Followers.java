package com.codigomx.main.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity(name = "followers")
@Table(name = "followers")
@EntityListeners(AuditingEntityListener.class)
public class Followers {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
    @Column(name = "follower_id")
	int followerId;
	
    @Column(name="follow_id")
    private int followId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public int getFollowerId() {
		return followerId;
	}

	public void setFollowerId(int followerId) {
		this.followerId = followerId;
	}

	public int getFollowId() {
		return followId;
	}

	public void setFollowId(int followId) {
		this.followId = followId;
	}
    
    

}
