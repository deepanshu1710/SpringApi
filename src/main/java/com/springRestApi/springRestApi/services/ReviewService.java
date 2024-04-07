package com.springRestApi.springRestApi.services;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springRestApi.springRestApi.entity.Mentor;
import com.springRestApi.springRestApi.entity.Review;
import com.springRestApi.springRestApi.repository.ReviewRepository;

@Service
public class ReviewService {
	
	 @Autowired
	    private ReviewRepository reviewRepository;

	    public Review addReview(Long mentorId, String reviewText) {
	        Review review = new Review();
	        Mentor mentor = new Mentor();
	        mentor.setId(mentorId);
	        review.setMentor(mentor);
	        review.setReviewText(reviewText);
	        return reviewRepository.save(review);
	    }

	    public List<Review> getAllReview() {
	        return reviewRepository.findAll();
	    }

	    public Review getReviewById(Long reviewId) {
	        return reviewRepository.findById(reviewId)
	                .orElseThrow(() -> new NoSuchElementException("Review not found"));
	    }

	    public void deleteReview(Long reviewId) {
	        reviewRepository.deleteById(reviewId);
	    }

}
