package com.ryu.QuerydslProject.domain.Review;

import com.ryu.QuerydslProject.domain.BaseTimeEntity;
import com.ryu.QuerydslProject.domain.Lecture.Lecture;
import com.ryu.QuerydslProject.domain.Member.Member;
import lombok.*;

import javax.persistence.*;
import javax.swing.*;
import java.time.LocalDateTime;

import static javax.persistence.FetchType.LAZY;


@Entity
@Getter
@NoArgsConstructor
public class Review extends BaseTimeEntity{

    @Id
    @GeneratedValue
    @Column(name = "review_id")
    private Long id;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    private String content;

    private Integer rating;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "lecture_id")
    private Lecture lecture;


    public Review(Member member, String content, Integer rating, Lecture lecture) {
        this.member = member;
        this.content = content;
        this.rating = rating;
        this.lecture = lecture;
    }

    public void changeContentAndRating(String content, Integer rating) {
        this.content = content;
        this.rating = rating;
    }
}