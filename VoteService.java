package com.codingninjas.EVotingSystem.services;

import com.codingninjas.EVotingSystem.entities.Election;
import com.codingninjas.EVotingSystem.entities.ElectionChoice;
import com.codingninjas.EVotingSystem.entities.Vote;
import com.codingninjas.EVotingSystem.repositories.ElectionChoiceRepository;
import com.codingninjas.EVotingSystem.repositories.ElectionRepository;
import com.codingninjas.EVotingSystem.repositories.VoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VoteService {

    @Autowired
    private VoteRepository voteRepository;

    @Autowired
    ElectionRepository electionRepository;

    @Autowired
    ElectionChoiceRepository electionChoiceRepository;

    public List<Vote> getAllVotes() {
        return voteRepository.findAll();
    }

    public Vote addVote(Vote vote) {
        return voteRepository.save(vote);
    }

    public long countVotesByElectionId(Long electionId) {
        return voteRepository.countByElection_Id(electionId);
    }

//    public ElectionChoice getWinnerByElectionId(Long electionId) {
//        return voteRepository.findWinnerByElectionId(electionId);
//    }

	public long countTotalVotes() {
		// TODO Auto-generated method stub
		return voteRepository.count();
	}

    public ElectionChoice findElectionChoiceWithMaxVotes(Election election) {
        // this election parameter might not contain id, so fetch it first with the name, which is unique
        Election existingElection = electionRepository.findByName(election.getName());
        // then use the id of the election to find the winner, because id is foreign key, which is used to join tables.
        return electionChoiceRepository.findElectionChoiceWithMaxVotes(existingElection.getId());
    }

}
