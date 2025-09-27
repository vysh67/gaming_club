package com.dscasc.Gaming.Club.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dscasc.Gaming.Club.entities.Recharge;


@Repository


public interface RechargeRepository extends JpaRepository<Recharge, Integer>{
	List<Recharge> findRechargeByMemberId(int member_id);
}
