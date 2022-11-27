package com.ryu.QuerydslProject.domain.member;

import com.ryu.QuerydslProject.domain.BaseTimeEntity;
import com.ryu.QuerydslProject.domain.point.Point;
import com.ryu.QuerydslProject.domain.review.Review;
import com.ryu.QuerydslProject.domain.trade.Trade;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User extends BaseTimeEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private Long id;

    private String userName;

    private int age;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private String phoneNumber;

    private Long point;

    @OneToMany(mappedBy = "user")
    private List<Review> reviews = new ArrayList<>();

    @OneToMany(mappedBy = "seller" )
    private List<Trade> saleTradeList = new ArrayList<>();

    @OneToMany(mappedBy = "buyer")
    private List<Trade> buyTradeList = new ArrayList<>();

    @OneToMany(mappedBy = "user")
    private List<Point> points = new ArrayList<>();

}