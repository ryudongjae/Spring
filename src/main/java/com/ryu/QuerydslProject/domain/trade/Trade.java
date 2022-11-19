package com.ryu.QuerydslProject.domain.trade;



import com.ryu.QuerydslProject.domain.Member.User;

import javax.persistence.*;

@Entity
public class Trade {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "trade_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User seller;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User buyer;

    private String startPoint;

    private String endPoint;
}
