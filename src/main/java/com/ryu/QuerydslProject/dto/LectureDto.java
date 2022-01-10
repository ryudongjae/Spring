package com.ryu.QuerydslProject.dto;

import lombok.Getter;

import java.net.URI;

@Getter
public class LectureDto {
    private String lectureName;
    private String teacherName;
    private String content;
    String representImagePath;
    long representImageSize;
    String representImageName;
    private String siteName;
    private URI uri;
}
