package com.springRestApi.sprintRestApi.Api.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springRestApi.springRestApi.entity.Review;
import com.springRestApi.springRestApi.services.ReviewService;



@RestController
@RequestMapping("/api/reviews")
public class ReviewController {
	
	@Autowired
    private ReviewService reviewService;

    @PostMapping
    public Review addReview(@RequestParam Long mentorId, @RequestParam String reviewText) {
        return reviewService.addReview(mentorId, reviewText);
    }

    @GetMapping("/{id}")
    public Review getReviewById(@PathVariable Long id) {
        return reviewService.getReviewById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteReview(@PathVariable Long id) {
        reviewService.deleteReview(id);
    }


   

}
