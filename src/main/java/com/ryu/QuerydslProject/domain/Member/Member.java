package com.ryu.QuerydslProject.domain.Member;

import com.fasterxml.jackson.databind.ser.Serializers;
import com.ryu.QuerydslProject.domain.BaseTimeEntity;
import com.ryu.QuerydslProject.domain.Review.Review;
import com.ryu.QuerydslProject.domain.trade.Trade;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member extends BaseTimeEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "member_id")
    private Long id;

    private String userName;

    private int age;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private String career;

    @OneToMany(mappedBy = "member")
    private List<Review> reviews = new ArrayList<>();

    @OneToMany(mappedBy = "seller")
    private List<Trade> salesList  = new ArrayList<>();

    @OneToMany(mappedBy = "buyer")
    private List<Trade> buyList  = new ArrayList<>();
    public Member(String userName, int age, Gender gender) {
        this.userName = userName;
        this.age = age;
        this.gender = gender;
    }

    public Member(String userName, int age, Gender gender, String career) {
        this.userName = userName;
        this.age = age;
        this.gender = gender;
        this.career = career;
    }
}