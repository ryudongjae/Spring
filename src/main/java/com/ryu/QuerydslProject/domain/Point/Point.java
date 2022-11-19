package com.ryu.QuerydslProject.domain.Point;

import com.ryu.QuerydslProject.domain.Member.User;

import javax.persistence.*;

@Entity
public class Point {

    @Id@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @Enumerated(EnumType.STRING)
    private PointType pointType;

    private Long amount;
}
