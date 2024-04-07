package com.springRestApi.sprintRestApi.Api.dto;

public class RecommendationRequest {
	
	private Long mentorId;
    private String recommendationLetter;
	public Long getMentorId() {
		return mentorId;
	}
	public void setMentorId(Long mentorId) {
		this.mentorId = mentorId;
	}
	public String getRecommendationLetter() {
		return recommendationLetter;
	}
	public void setRecommendationLetter(String recommendationLetter) {
		this.recommendationLetter = recommendationLetter;
	}
	public RecommendationRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RecommendationRequest(Long mentorId, String recommendationLetter) {
		super();
		this.mentorId = mentorId;
		this.recommendationLetter = recommendationLetter;
	}
	@Override
	public String toString() {
		return "RecommendationRequest [mentorId=" + mentorId + ", recommendationLetter=" + recommendationLetter + "]";
	}
    
    

}
