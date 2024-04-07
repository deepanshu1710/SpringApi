package com.springRestApi.springRestApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springRestApi.springRestApi.entity.RecommendStudent;


public interface RecommendStudentRepository extends JpaRepository<RecommendStudent, Long> {

}
