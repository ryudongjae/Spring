package com.ryu.QuerydslProject.domain.trade;



import com.ryu.QuerydslProject.domain.address.Address;
import com.ryu.QuerydslProject.domain.member.User;
import com.ryu.QuerydslProject.domain.order.Order;
import com.ryu.QuerydslProject.domain.review.Review;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
public class Trade {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "trade_id")
    private Long id;
    //가져오는사람
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User seller;

    //물품을 주문한사람
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User buyer;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id")
    private Order order;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "review_id")
    private Review review;

    @Enumerated(value = EnumType.STRING)
    private TradeStatus tradeStatus;

    //픽업 위치
    @Embedded
    private Address startPoint;

    //받는 위치
    @Embedded
    private Address endPoint;

    //소요 시간
    private int requiredTime;

    //거래 끝난 시간
    private LocalDateTime endTime;

}
