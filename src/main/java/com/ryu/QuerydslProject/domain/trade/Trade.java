package com.ryu.QuerydslProject.domain.trade;

import ch.qos.logback.core.joran.action.ActionUtil;
import com.ryu.QuerydslProject.domain.Member.Member;

import javax.persistence.*;

@Entity
public class Trade {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "trade_id")
    private Long id;

    @ManyToOne
    private Member seller;

    @ManyToOne
    private Member buyer;

    private String startPoint;

    private String endPoint;
}
