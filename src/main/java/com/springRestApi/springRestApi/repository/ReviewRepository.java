package com.springRestApi.springRestApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springRestApi.springRestApi.entity.Review;

public interface ReviewRepository extends JpaRepository<Review, Long>{

}
