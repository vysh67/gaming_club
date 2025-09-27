package com.dscasc.Gaming.Club.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dscasc.Gaming.Club.entities.Member;

@Repository

public interface MemberRepository extends JpaRepository<Member, Integer>{
	Member findMemberByPhone(String phone);
}
