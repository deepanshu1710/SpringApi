package com.springRestApi.springRestApi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Review {

	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String reviewText;
	    @ManyToOne
	    private Mentor mentor;
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getReviewText() {
			return reviewText;
		}
		public void setReviewText(String reviewText) {
			this.reviewText = reviewText;
		}
		public Mentor getMentor() {
			return mentor;
		}
		public void setMentor(Mentor mentor) {
			this.mentor = mentor;
		}
		public Review() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Review(Long id, String reviewText, Mentor mentor) {
			super();
			this.id = id;
			this.reviewText = reviewText;
			this.mentor = mentor;
		}
		@Override
		public String toString() {
			return "Review [id=" + id + ", reviewText=" + reviewText + ", mentor=" + mentor + "]";
		}
	    
	    
}
