package com.springRestApi.sprintRestApi.Api.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springRestApi.springRestApi.entity.RecommendStudent;
import com.springRestApi.springRestApi.services.RecommendStudentService;

@RestController
@RequestMapping("/api/recommend-students")
public class RecommendStudentController {

	@Autowired
    private RecommendStudentService recommendStudentService;

    @PostMapping
    public RecommendStudent recommendStudent(@RequestParam Long mentorId, @RequestParam String recommendation) {
        return recommendStudentService.recommendStudent(mentorId, recommendation);
    }

    @GetMapping("/{id}")
    public RecommendStudent getRecommendationById(@PathVariable Long id) {
        return recommendStudentService.getRecommendationById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteRecommendation(@PathVariable Long id) {
        recommendStudentService.deleteRecommendation(id);
    }

 
}

