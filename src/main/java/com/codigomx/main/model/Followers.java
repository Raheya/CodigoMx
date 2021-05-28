package com.codigomx.main.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "followers")
@EntityListeners(AuditingEntityListener.class)
public class Followers {
	
    @ManyToOne
    @JoinColumn(name = "follower_id", nullable = false, updatable = false)
	private int followerId;
	
    @Column(name="follow_id")
    private int followId;

}
