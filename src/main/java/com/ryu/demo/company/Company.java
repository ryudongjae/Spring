package com.ryu.demo.company;

import com.ryu.demo.apply.Apply;
import com.ryu.demo.model.Address;
import com.ryu.demo.model.BaseTimeEntity;
import com.ryu.demo.model.LoginBase;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Company  extends BaseTimeEntity {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @Embedded
    private LoginBase loginBase;

    @Embedded
    private Address address;

    @OneToMany(mappedBy = "company" ,fetch = FetchType.LAZY)
    private List<Apply> applyList = new ArrayList<>();
}
