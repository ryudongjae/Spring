package com.ryu.QuerydslProject.service;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class FileInfo {
    private String filePath;
    private String fileName;
    private long fileSize;
}
