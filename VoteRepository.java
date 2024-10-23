package com.codingninjas.EVotingSystem.repositories;

import com.codingninjas.EVotingSystem.entities.Election;
import org.springframework.data.jpa.repository.JpaRepository;

import com.codingninjas.EVotingSystem.entities.ElectionChoice;
import com.codingninjas.EVotingSystem.entities.Vote;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface VoteRepository extends JpaRepository<Vote, Long> {

	long countByElection_Id(Long electionId);

	ElectionChoice findWinnerByElectionId(Long electionId);


}