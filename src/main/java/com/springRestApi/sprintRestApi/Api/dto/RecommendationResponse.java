package com.springRestApi.sprintRestApi.Api.dto;

public class RecommendationResponse {
	
	private Long id;
    private Long mentorId;
    private String recommendationLetter;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
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
	public RecommendationResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RecommendationResponse(Long id, Long mentorId, String recommendationLetter) {
		super();
		this.id = id;
		this.mentorId = mentorId;
		this.recommendationLetter = recommendationLetter;
	}
	@Override
	public String toString() {
		return "RecommendationResponse [id=" + id + ", mentorId=" + mentorId + ", recommendationLetter="
				+ recommendationLetter + "]";
	}
    
    

}
