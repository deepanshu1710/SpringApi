package com.springRestApi.sprintRestApi.Api.dto;

public class ReviewRequest {
	
	 	private Long userId;
	    private Long mentorId;
	    private int rating;
	    private String comment;
		public Long getUserId() {
			return userId;
		}
		public void setUserId(Long userId) {
			this.userId = userId;
		}
		public Long getMentorId() {
			return mentorId;
		}
		public void setMentorId(Long mentorId) {
			this.mentorId = mentorId;
		}
		public int getRating() {
			return rating;
		}
		public void setRating(int rating) {
			this.rating = rating;
		}
		public String getComment() {
			return comment;
		}
		public void setComment(String comment) {
			this.comment = comment;
		}
		public ReviewRequest() {
			super();
			// TODO Auto-generated constructor stub
		}
		public ReviewRequest(Long userId, Long mentorId, int rating, String comment) {
			super();
			this.userId = userId;
			this.mentorId = mentorId;
			this.rating = rating;
			this.comment = comment;
		}
		@Override
		public String toString() {
			return "ReviewRequest [userId=" + userId + ", mentorId=" + mentorId + ", rating=" + rating + ", comment="
					+ comment + "]";
		}
	    
	    
}
