package com.srimal.crud.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.srimal.crud.example.entities.User;



public interface UserRepository extends JpaRepository<User, Integer>{

	User findByUsername(String username);

}
