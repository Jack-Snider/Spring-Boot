package com.choi.springtboot.member.repository;

import com.choi.springtboot.member.repository.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MemberRepository extends JpaRepository<Member, Long> {
}
