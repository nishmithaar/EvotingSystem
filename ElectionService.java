package com.codingninjas.EVotingSystem.services;

import com.codingninjas.EVotingSystem.entities.Election;
import com.codingninjas.EVotingSystem.repositories.ElectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ElectionService {

    @Autowired
    private ElectionRepository electionRepository;

    public List<Election> getAllElections() {
        return electionRepository.findAll();
    }

    public Election addElection(Election election) {
        return electionRepository.save(election);
    }

    public Election getElectionById(Long id) {
        return electionRepository.findById(id).get();
    }
}
