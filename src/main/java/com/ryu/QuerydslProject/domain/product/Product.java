package com.ryu.QuerydslProject.domain.product;

import com.ryu.QuerydslProject.domain.Member.Member;
import com.ryu.QuerydslProject.domain.Review.Review;
import com.ryu.QuerydslProject.domain.trade.Trade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "product_id")
    private Long id;

    private String name;

    private int price;

    private String information;

    //제품의 주인
    @ManyToOne
    private Member member;

    //제품 거래
    @ManyToOne
    private Trade trade;

    //제품의 리뷰 리스트
    @OneToMany(mappedBy = "product")
    private List<Review> reviews = new ArrayList<>();

}

