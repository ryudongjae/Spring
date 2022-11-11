package com.ryu.QuerydslProject.common;

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
