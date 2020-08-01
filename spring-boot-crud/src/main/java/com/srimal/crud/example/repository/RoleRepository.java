package com.srimal.crud.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.srimal.crud.example.entities.Role;



public interface RoleRepository extends JpaRepository<Role, Integer>{

}