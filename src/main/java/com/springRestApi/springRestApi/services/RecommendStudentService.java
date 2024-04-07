package com.springRestApi.springRestApi.services;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springRestApi.springRestApi.entity.Mentor;
import com.springRestApi.springRestApi.entity.RecommendStudent;
import com.springRestApi.springRestApi.repository.RecommendStudentRepository;

@Service
public class RecommendStudentService {
	
	@Autowired
    private RecommendStudentRepository recommendStudentRepository;

    public RecommendStudent recommendStudent(Long mentorId, String recommendation) {
        RecommendStudent recommendStudent = new RecommendStudent();
        Mentor mentor = new Mentor();
        mentor.setId(mentorId);
        recommendStudent.setMentor(mentor);
        recommendStudent.setRecommendation(recommendation);
        return recommendStudentRepository.save(recommendStudent);
    }

    public List<RecommendStudent> getAllRecommendStudent() {
        return recommendStudentRepository.findAll();
    }

    public RecommendStudent getRecommendationById(Long recommendationId) {
        return recommendStudentRepository.findById(recommendationId)
                .orElseThrow(() -> new NoSuchElementException("Recommendation not found"));
    }

    public void deleteRecommendation(Long recommendationId) {
        recommendStudentRepository.deleteById(recommendationId);
    }

}
