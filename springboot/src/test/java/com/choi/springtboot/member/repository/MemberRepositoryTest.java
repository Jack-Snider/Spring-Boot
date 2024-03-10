package com.choi.springtboot.member.repository;

import com.choi.springtboot.member.repository.entity.Member;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MemberRepositoryTest {

    @Autowired
    private MemberRepository memberRepository;

    @Test
    public void crudTest(){
        Member member = Member.builder()
                .id("Choi")
                .name("Hyunwoo")
                .phoneNumber("010-1234-5678")
                .build();

        // create test
        memberRepository.save(member);

        // get test
        Member foundMember = memberRepository.findById(1L).get();

    }



}
