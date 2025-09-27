package com.dscasc.Gaming.Club.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dscasc.Gaming.Club.Dtos.PlayGameDto;
import com.dscasc.Gaming.Club.entities.Game;
import com.dscasc.Gaming.Club.entities.Member;
import com.dscasc.Gaming.Club.entities.Transaction;
import com.dscasc.Gaming.Club.repository.GameRepository;
import com.dscasc.Gaming.Club.repository.MemberRepository;
import com.dscasc.Gaming.Club.repository.TransactionRepository;

@Service

public class TransactionService {
	
	@Autowired TransactionRepository transactionRepository;
	@Autowired MemberRepository memberRepo;
	@Autowired GameRepository gameRepo;
	
	public Transaction playGame(PlayGameDto gameDto) {
	Member member=memberRepo.findById(gameDto.getMember_id()).get();
	Game game=gameRepo.findById(gameDto.getGame_id()).get();
	
	Transaction transaction=new Transaction();
	transaction.setMember(member);
	transaction.setGame(game);
	transaction.setAmount(game.getAmount());
	transaction.setDate_time(LocalDateTime.now());
	transactionRepository.save(transaction);
	
	member.setBalance(member.getBalance()-game.getAmount());
	memberRepo.save(member);
	
	return transaction;
	}

}
