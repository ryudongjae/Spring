package com.ryu.QuerydslProject.domain.Review;

import com.ryu.QuerydslProject.domain.BaseTimeEntity;
import com.ryu.QuerydslProject.domain.Member.Member;
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

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    private String content;

    private Integer rating;


    public Review(Member member, String content, Integer rating) {
        this.member = member;
        this.content = content;
        this.rating = rating;

    }

    public void changeContentAndRating(String content, Integer rating) {
        this.content = content;
        this.rating = rating;
    }
}