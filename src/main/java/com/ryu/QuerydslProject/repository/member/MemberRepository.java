package com.ryu.QuerydslProject.repository.member;

import com.ryu.QuerydslProject.domain.Member.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MemberRepository extends JpaRepository<Member,Long> {
    List<Member> findByUserName(String userName);
}
