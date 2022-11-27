package com.ryu.QuerydslProject.service;

import com.ryu.QuerydslProject.repository.user.UserRepository;
import com.ryu.QuerydslProject.service.user.UserService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MemberServiceTest {
    @Autowired
    UserService memberService;

    @Autowired
    UserRepository memberRepository;

    @Test
    @DisplayName("회원 중복")
    void duplicate_member()throws Exception{
//        //given
//        User member1 = new User("ryu",22, Gender.MALE);
//        User member2 = new User("ryu",23, Gender.MALE);
//
//        //when
//        memberService.saveUser(member1);
//
//        //then
//        Assertions.assertThrows(IllegalStateException.class, ()->{
//                memberService.saveUser(member2);
//        });

    }

    @Test
    @DisplayName("회원 가입")
    void save_member()throws Exception{
//        //given
//        User member = new User("ryu",23,Gender.MALE);
//
//        //when
//        memberService.saveUser(member);
//        User saveMember = memberRepository.findById(member.getId()).orElseThrow();
//        //then
//        org.assertj.core.api.Assertions.assertThat(member.getAge()).isEqualTo(saveMember.getAge());
//        org.assertj.core.api.Assertions.assertThat(member.getUserName()).isEqualTo(saveMember.getUserName());
//        org.assertj.core.api.Assertions.assertThat(member.getGender()).isEqualTo(saveMember.getGender());
    }


}