package com.ryu.QuerydslProject.service;

import com.ryu.QuerydslProject.domain.Member.Gender;
import com.ryu.QuerydslProject.domain.Member.Member;
import com.ryu.QuerydslProject.repository.member.MemberRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MemberServiceTest {
    @Autowired
    MemberService memberService;

    @Autowired
    MemberRepository memberRepository;

    @Test
    @DisplayName("회원 중복")
    void duplicate_member()throws Exception{
        //given
        Member member1 = new Member("ryu",22, Gender.MALE);
        Member member2 = new Member("ryu",23, Gender.MALE);

        //when
        memberService.join(member1);

        //then
        Assertions.assertThrows(IllegalStateException.class, ()->{
                memberService.join(member2);
        });

    }
}