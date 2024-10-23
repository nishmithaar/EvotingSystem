package com.codingninjas.EVotingSystem.controllers;

import com.codingninjas.EVotingSystem.entities.Election;
import com.codingninjas.EVotingSystem.entities.ElectionChoice;
import com.codingninjas.EVotingSystem.services.ElectionChoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ElectionChoiceController {

    @Autowired
    private ElectionChoiceService electionChoiceService;

    @GetMapping("/get/electionChoices")
    public List<ElectionChoice> getAllElectionChoices() {
        return electionChoiceService.getAllElectionChoices();
    }

    @PostMapping("/add/electionChoice")
    public ElectionChoice addElectionChoice(@RequestBody ElectionChoice electionChoice) {
        return electionChoiceService.addElectionChoice(electionChoice);
    }


    @PostMapping("/count/election/choices")
    public long getElectionChoicesByElectionId(@RequestBody Election election) {
        return electionChoiceService.getElectionChoicesByElectionId(election.getId());
    }

//    @PostMapping("/byElection")
//    public List<ElectionChoice> getElectionChoicesByElectionId(@RequestBody Long electionId) {
//        return electionChoiceService.getElectionChoicesByElectionId(electionId);
//    }
    
}
