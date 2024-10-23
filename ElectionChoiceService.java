package com.codingninjas.EVotingSystem.services;

import com.codingninjas.EVotingSystem.entities.ElectionChoice;
import com.codingninjas.EVotingSystem.repositories.ElectionChoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ElectionChoiceService {

	 @Autowired
	    private ElectionChoiceRepository electionChoiceRepository;

	    public List<ElectionChoice> getAllElectionChoices() {
	        return electionChoiceRepository.findAll();
	    }

	    public ElectionChoice addElectionChoice(ElectionChoice electionChoice) {
	        return electionChoiceRepository.save(electionChoice);
	    }

	    public long getElectionChoicesByElectionId(Long electionId) {
	         return electionChoiceRepository.countByElection_id(electionId);
	    }
}
