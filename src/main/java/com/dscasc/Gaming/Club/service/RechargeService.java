package com.dscasc.Gaming.Club.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dscasc.Gaming.Club.Dtos.DoRechargeDto;
import com.dscasc.Gaming.Club.entities.Collection;
import com.dscasc.Gaming.Club.entities.Member;
import com.dscasc.Gaming.Club.entities.Recharge;
import com.dscasc.Gaming.Club.repository.CollectionRepository;
import com.dscasc.Gaming.Club.repository.MemberRepository;
import com.dscasc.Gaming.Club.repository.RechargeRepository;

@Service
public class RechargeService {
	@Autowired private RechargeRepository rechargeRepository;
	@Autowired private MemberRepository memberRepository;
	@Autowired private CollectionRepository collectionRepository;
	public Recharge doRecharge(DoRechargeDto rechargeDto) {
		Member member=memberRepository.findById(rechargeDto.getMember_id()).get();
		Recharge recharge=new Recharge();
		recharge.setMember(member);
		recharge.setDate_time(LocalDateTime.now());
		recharge.setAmount(rechargeDto.getAmount());
		rechargeRepository.save(recharge);
		
		member.setBalance(rechargeDto.getAmount());
		memberRepository.save(member);
		
		Optional<Collection> collectOptional=collectionRepository.findCollectionByDate(LocalDate.now());
		if(collectOptional.isPresent()) {
			Collection collection=collectOptional.get();
			collection.setAmount(collection.getAmount()+rechargeDto.getAmount());
			collectionRepository.save(collection);
		}else {
			Collection collection=new Collection();
			collection.setDate(LocalDate.now());
			collection.setAmount(rechargeDto.getAmount());
			collectionRepository.save(collection);
			
		}
		return recharge;
	}
}
