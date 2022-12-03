package com.ryu.demo.apply;

import com.ryu.demo.board.Board;
import com.ryu.demo.company.Company;
import com.ryu.demo.model.BaseTimeEntity;
import com.ryu.demo.user.User;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Apply extends BaseTimeEntity {

    @Id
    @GeneratedValue
    @Column(name = "apply_id")
    private Long id;

    private String application;

    @ManyToOne(fetch = FetchType.LAZY)
    private Board board;

    @ManyToOne(fetch = FetchType.LAZY)
    private Company company;

    @ManyToOne(fetch = FetchType.LAZY)
    private User volunteer;
}
