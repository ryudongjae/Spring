package com.ryu.QuerydslProject.domain.address;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;


@Embeddable
@NoArgsConstructor
@AllArgsConstructor
public class Address {

    private String addressName;
    private String roadAddress;
    private String detailAddress;
    private String postalCode;
    private int latitude;
    private int longitude;

}
