package com.ryu.QuerydslProject.domain.order;

public enum AcceptanceStatus {

    ACCEPT(1,"수락완료"),
    STANDBY(2,"대기중"),
    TRANSACTION_IN_PROGRESS(3,"거래 진행중");


    private int statusId;
    private String status;

    AcceptanceStatus(int statusId, String status) {
        this.statusId = statusId;
        this.status = status;
    }
}
