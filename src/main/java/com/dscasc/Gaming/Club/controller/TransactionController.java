package com.dscasc.Gaming.Club.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dscasc.Gaming.Club.Dtos.PlayGameDto;
import com.dscasc.Gaming.Club.entities.Transaction;
import com.dscasc.Gaming.Club.service.TransactionService;

@RestController
@RequestMapping("/transaction")

public class TransactionController {
	@Autowired TransactionService transactionService;
	
	@PostMapping("/play")
	public Transaction playGame(@RequestBody PlayGameDto gameDto) {
		return transactionService.playGame(gameDto);
	}

}
