package com.ryu.QuerydslProject.domain.Member;

public enum Gender {
    MALE("남자"), FEMALE("여자");

    private final String description;

    Gender(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}
