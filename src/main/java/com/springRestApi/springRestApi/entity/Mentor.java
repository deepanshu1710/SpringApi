package com.springRestApi.springRestApi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Mentor {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double rating;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public Mentor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Mentor(Long id, String name, double rating) {
		super();
		this.id = id;
		this.name = name;
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Mentor [id=" + id + ", name=" + name + ", rating=" + rating + "]";
	}
    
    
}
