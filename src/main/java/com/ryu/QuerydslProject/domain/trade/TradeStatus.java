package com.ryu.QuerydslProject.domain.trade;

public enum TradeStatus {

    BID(1,"거래전"),
    PROGRESS(2,"진행중"),
    END(3,"거래 완료"),
    CANCEL(4,"거래취소");

    private int statusId;
    private String status;

    TradeStatus(int statusId,String status){
        this.statusId = statusId;
        this.status = status;
    }
}
