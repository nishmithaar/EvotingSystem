package com.codingninjas.EVotingSystem.controllers;

import com.codingninjas.EVotingSystem.entities.Election;
import com.codingninjas.EVotingSystem.services.ElectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ElectionController {

    @Autowired
    private ElectionService electionService;

    @GetMapping("/get/elections")
    public List<Election> getAllElections() {
        return electionService.getAllElections();
    }

    @PostMapping("/add/election")
    public Election addElection(@RequestBody Election election) {
        return electionService.addElection(election);
    }
}
