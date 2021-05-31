package com.codigomx.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codigomx.main.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
