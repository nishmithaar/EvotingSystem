package com.codingninjas.EVotingSystem.controllers;

import com.codingninjas.EVotingSystem.entities.Election;
import com.codingninjas.EVotingSystem.entities.ElectionChoice;
import com.codingninjas.EVotingSystem.services.ElectionService;
import com.codingninjas.EVotingSystem.services.VoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ResultsController {

    @Autowired
    private VoteService voteService;

    @Autowired
    private ElectionService electionService;

    @PostMapping("/winner/election")
    public ElectionChoice getElectionWinner(@RequestBody Election election) {
//        return voteService.getWinnerByElectionId(election.getId());
//         election = electionService.getElectionById(election.getId());
//        Election updatedWinner = votingService.findElectionByName(election.getName());
        return voteService.findElectionChoiceWithMaxVotes(election);

    }
}
