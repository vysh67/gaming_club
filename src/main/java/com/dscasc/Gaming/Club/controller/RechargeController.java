package com.dscasc.Gaming.Club.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dscasc.Gaming.Club.Dtos.DoRechargeDto;
import com.dscasc.Gaming.Club.entities.Recharge;
import com.dscasc.Gaming.Club.service.RechargeService;

@RestController
@RequestMapping("/recharge")
public class RechargeController {
	@Autowired RechargeService rechargeService;
	
	@PostMapping
	public Recharge recharge(@RequestBody DoRechargeDto rechargeDto) {
		return rechargeService.doRecharge(rechargeDto);
	}

}
