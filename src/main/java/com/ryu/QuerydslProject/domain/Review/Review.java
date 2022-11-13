package com.ryu.QuerydslProject.domain.Review;

import com.ryu.QuerydslProject.domain.BaseTimeEntity;
import com.ryu.QuerydslProject.domain.Member.Member;
import com.ryu.QuerydslProject.domain.product.Product;
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
    @JoinColumn(name = "member_id")
    private Member member;

    //리뷰남길 제품
    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "product_id")
    private Product product;

    //리뷰 내용
    private String content;

    private Integer rating;

    public Review(Member member, Product product, String content, Integer rating) {
        this.member = member;
        this.product = product;
        this.content = content;
        this.rating = rating;
    }

    public void changeContentAndRating(String content, Integer rating) {
        this.content = content;
        this.rating = rating;
    }
}