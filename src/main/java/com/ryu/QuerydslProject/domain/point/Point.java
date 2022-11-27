package com.ryu.QuerydslProject.domain.point;

import com.ryu.QuerydslProject.domain.member.User;

import javax.persistence.*;

@Entity
public class Point {

    @Id@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "point_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @Enumerated(EnumType.STRING)
    private PointType pointType;

    private Long amount;
}
