package com.ryu.QuerydslProject.domain.Review;

import com.ryu.QuerydslProject.domain.BaseTimeEntity;

import com.ryu.QuerydslProject.domain.Member.User;
import com.ryu.QuerydslProject.domain.product.Product;
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
    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    //리뷰남길 제품
    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "trade_id")
    private Trade trade;

    //리뷰 내용
    private String content;

    @Enumerated(value = EnumType.STRING)
    private StarPoint starPoint;
}