package com.codigomx.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codigomx.main.model.Followers;

@Repository
public interface FollowerRepository extends JpaRepository<Followers, Long>{

}
