package com.springRestApi.springRestApi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class RecommendStudent {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String recommendation;
    @ManyToOne
    private Mentor mentor;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRecommendation() {
		return recommendation;
	}
	public void setRecommendation(String recommendation) {
		this.recommendation = recommendation;
	}
	public Mentor getMentor() {
		return mentor;
	}
	public void setMentor(Mentor mentor) {
		this.mentor = mentor;
	}
	public RecommendStudent() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RecommendStudent(Long id, String recommendation, Mentor mentor) {
		super();
		this.id = id;
		this.recommendation = recommendation;
		this.mentor = mentor;
	}
	@Override
	public String toString() {
		return "RecommendStudent [id=" + id + ", recommendation=" + recommendation + ", mentor=" + mentor + "]";
	}
    
    

}
