package com.ryu.QuerydslProject.domain.order;

import com.ryu.QuerydslProject.domain.BaseTimeEntity;
import com.ryu.QuerydslProject.domain.address.Address;
import com.ryu.QuerydslProject.domain.member.User;
import com.ryu.QuerydslProject.domain.point.Point;
import com.ryu.QuerydslProject.domain.trade.Trade;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
public class Order extends BaseTimeEntity {

    @Id@GeneratedValue
    @Column(name = "order_id")
    private Long id;

    //주문을 올린사람
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    private String information;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "trade_id")
    private Trade trade;

    //심부름 값
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "point_id")
    private Point point;

    private AcceptanceStatus acceptanceStatus;

    @Embedded
    private Address address;
}
