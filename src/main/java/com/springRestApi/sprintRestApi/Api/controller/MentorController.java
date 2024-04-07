package com.springRestApi.sprintRestApi.Api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springRestApi.springRestApi.entity.Mentor;
import com.springRestApi.springRestApi.services.MentorService;

@RestController
@RequestMapping("/api/mentors")
public class MentorController {
	
	@Autowired
    private MentorService mentorService;

    @GetMapping
    public List<Mentor> getAllMentors() {
        return mentorService.getAllMentors();
    }

    @GetMapping("/{id}")
    public Mentor getMentorById(@PathVariable Long id) {
        return mentorService.getMentorById(id);
    }

    @PostMapping
    public Mentor createMentor(@RequestBody Mentor mentor) {
        return mentorService.saveMentor(mentor);
    }

    @PutMapping("/{id}")
    public Mentor updateMentor(@PathVariable Long id, @RequestBody Mentor mentor) {
        mentor.setId(id); // Ensure the ID is set
        return mentorService.updateMentor(mentor);
    }

    @DeleteMapping("/{id}")
    public void deleteMentor(@PathVariable Long id) {
        mentorService.deleteMentor(id);
    }

    @PutMapping("/{id}/rate")
    public Mentor rateMentor(@PathVariable Long id, @RequestParam int rating) {
        return mentorService.rateMentor(id, rating);
    }


}
