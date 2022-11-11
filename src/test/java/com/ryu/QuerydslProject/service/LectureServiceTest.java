package com.ryu.QuerydslProject.service;

import com.ryu.QuerydslProject.common.FileInfo;
import com.ryu.QuerydslProject.domain.Lecture.Lecture;
import com.ryu.QuerydslProject.repository.lecture.LectureRepository;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItem;
import org.apache.commons.io.IOUtils;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;

@SpringBootTest
class LectureServiceTest {

    @Autowired
    LectureService lectureService;
    @Autowired
    LectureRepository lectureRepository;
    
    @Test
    @DisplayName("")
    void duplicate_lecture()throws Exception{
        //given
        
        //when
        
        //then
        
    
    }
    
    @Test
    @DisplayName("")        
    void lecture_save()throws Exception{
        //given
        
        //when
        
        //then
        
    
    }
    
    @Test
    @DisplayName("")        
    void lecture_saveByPhoto()throws Exception{
        //given
        
        //when
        
        //then
        
    
    }
    
    @Test
    @DisplayName("")        
    void lecture_update()throws Exception{
        //given
        
        //when
        
        //then
        
    
    }
    
    @Test
    @DisplayName("")        
    void lecture_find()throws Exception{
        //given
        
        //when
        
        //then
        
    
    }
    private Lecture getLecture(FileInfo fileInfo) throws URISyntaxException {
        URI uri = new URI("https://www.inflearn.com/");
        Lecture lecture = new Lecture("테스트", "테스트", "좋아요", fileInfo.getFilePath(), fileInfo.getFileSize(), fileInfo.getFileName(), "인프런", uri);
        lectureService.join(lecture);
        return lecture;
    }
    private MultipartFile getMultipartFile(Lecture lecture) throws IOException {
        File file = new File(new File("").getAbsolutePath() + "/src/main/resources/static"+ lecture.getRepresentImagePath());
        FileItem fileItem = new DiskFileItem("newFile", Files.probeContentType(file.toPath()), false, file.getName(), (int) file.length(), file.getParentFile());


        try {
            InputStream input = new FileInputStream(file);
            OutputStream os = fileItem.getOutputStream();
            IOUtils.copy(input, os);

        } catch (IOException ex) {

        }

        //저장한 파일 다시 multipartfile로 가져오기
        MultipartFile mFile1 = new CommonsMultipartFile(fileItem);
        return mFile1;
    }

    private MultipartFile getMultipartFile() throws IOException {
        File file = new File(new File("").getAbsolutePath() + "/src/main/resources/static/images/jpa.png");
        FileItem fileItem = new DiskFileItem("originFile", Files.probeContentType(file.toPath()), false, file.getName(), (int) file.length(), file.getParentFile());

        try {
            InputStream input = new FileInputStream(file);
            OutputStream os = fileItem.getOutputStream();
            IOUtils.copy(input, os);
        } catch (IOException ex) {

        }

        //jpa.png -> multipart 변환
        MultipartFile mFile = new CommonsMultipartFile(fileItem);
        return mFile;
    }
}