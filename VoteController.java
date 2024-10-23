package com.codingninjas.EVotingSystem.controllers;

import com.codingninjas.EVotingSystem.entities.Election;
import  com.codingninjas.EVotingSystem.entities.Vote;
import com.codingninjas.EVotingSystem.repositories.ElectionRepository;
import com.codingninjas.EVotingSystem.services.ElectionService;
import  com.codingninjas.EVotingSystem.services.VoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VoteController {

    @Autowired
    private VoteService voteService;


    @GetMapping("/get/votes")
    public List<Vote> getAllVotes() {
        return voteService.getAllVotes();
    }

    @PostMapping("/add/vote")
    public Vote addVote(@RequestBody Vote vote) {
        return voteService.addVote(vote);
    }

    @GetMapping("/count/votes")
    public long getTotalVotes() {
        return voteService.countTotalVotes();
    }

    @PostMapping("/count/election/votes")
    public long countVotesByElection(@RequestBody Election election) {
        return voteService.countVotesByElectionId(election.getId());
    }



}
