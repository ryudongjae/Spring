package com.ryu.QuerydslProject.domain.trade;

import ch.qos.logback.core.joran.action.ActionUtil;
import com.ryu.QuerydslProject.domain.Member.Member;

import javax.persistence.*;

@Entity
public class Trade {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private Member seller;

    @ManyToOne
    private Member buyer;
}
