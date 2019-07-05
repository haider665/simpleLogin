package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.UserRole;

public interface UserRoleImpl  extends JpaRepository<UserRole, Integer>{

}
