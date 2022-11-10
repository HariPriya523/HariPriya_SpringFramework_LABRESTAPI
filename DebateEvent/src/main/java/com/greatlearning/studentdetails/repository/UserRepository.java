package com.greatlearning.studentdetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.greatlearning.studentdetails.entity.User;

@Repository

public interface UserRepository extends JpaRepository<User, Integer>{

	User findByUsername(String username);
}
