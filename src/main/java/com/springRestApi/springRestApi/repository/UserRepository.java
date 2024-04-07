package com.springRestApi.springRestApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springRestApi.springRestApi.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
