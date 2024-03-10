package com.choi.springtboot.member.service;

import com.choi.springtboot.member.repository.MemberRepository;
import com.choi.springtboot.member.repository.entity.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;

    public String join(String id, String name, String phoneNumber){
        Member member = Member.builder()
                .id(id)
                .name(name)
                .phoneNumber(phoneNumber)
                .build();
        memberRepository.save(member);
        return "success";
    }

}
