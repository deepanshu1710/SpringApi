package com.springRestApi.springRestApi.services;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springRestApi.springRestApi.entity.Mentor;
import com.springRestApi.springRestApi.repository.MentorRepository;

@Service
public class MentorService {
	
	@Autowired
    private MentorRepository mentorRepository;

    public Mentor rateMentor(Long mentorId, int rating) {
        Mentor mentor = mentorRepository.findById(mentorId)
                .orElseThrow(() -> new NoSuchElementException("Mentor not found"));
        double newRating = (mentor.getRating() + rating) / 2.0;
        mentor.setRating(newRating);
        return mentorRepository.save(mentor);
    }

    public Mentor getMentorById(Long mentorId) {
        return mentorRepository.findById(mentorId)
                .orElseThrow(() -> new NoSuchElementException("Mentor not found"));
    }
    public List<Mentor> getAllMentors() {
        return mentorRepository.findAll();
    }

    public Mentor saveMentor(Mentor mentor) {
        return mentorRepository.save(mentor);
    }

    public Mentor updateMentor(Mentor mentor) {
        return mentorRepository.save(mentor);
    }

    public void deleteMentor(Long mentorId) {
        mentorRepository.deleteById(mentorId);
    }

}
