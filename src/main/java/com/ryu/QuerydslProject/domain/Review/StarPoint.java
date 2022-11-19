package com.ryu.QuerydslProject.domain.Review;

public enum StarPoint {

    BRONZE("bronze",1),
    SILVER("silver",2),
    GOLD("gold",3),
    PLATINUM("platinum",4),
    DIA("dia",5);

    private String grade;
    private float point;

    StarPoint(String grade, float point) {
        this.grade = grade;
        this.point = point;
    }
}
