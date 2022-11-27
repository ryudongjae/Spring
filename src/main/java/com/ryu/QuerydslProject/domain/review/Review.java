package com.ryu.QuerydslProject.domain.review;

import com.ryu.QuerydslProject.domain.BaseTimeEntity;

import com.ryu.QuerydslProject.domain.member.User;
import com.ryu.QuerydslProject.domain.trade.Trade;
import lombok.*;

import javax.persistence.*;

import static javax.persistence.FetchType.LAZY;

//거래 리뷰 , 제품 리뷰

@Entity
@Getter
@NoArgsConstructor
public class Review extends BaseTimeEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "review_id")
    private Long id;

    //리뷰 남기는 사람
    //아마 거래를 요청한 사람
    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    //리뷰남길 거래
    @OneToOne(fetch = LAZY)
    @JoinColumn(name = "trade_id")
    private Trade trade;

    //리뷰 내용
    private String content;

    //별점
    @Enumerated(value = EnumType.STRING)
    private StarPoint starPoint;
}