package com.ryu.QuerydslProject.service;

import com.ryu.QuerydslProject.repository.user.UserRepository;
import com.ryu.QuerydslProject.repository.review.ReviewRepository;
import com.ryu.QuerydslProject.service.review.ReviewService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ReviewServiceTest {

    @Autowired
    ReviewService reviewService;

    @Autowired
    ReviewRepository reviewRepository;

    @Autowired
    UserRepository memberRepository;

    
    @Test
    @DisplayName("")        
    void review_save()throws Exception{
        //given
        
        //when
        
        //then
        
    
    }
    
    @Test
    @DisplayName("")        
    void review_update()throws Exception{
        //given
        
        //when
        
        //then
        
    
    }
    
    @Test
    @DisplayName("")        
    void review_delete()throws Exception{
        //given
        
        //when
        
        //then
        
    
    }
    
    @Test
    @DisplayName("")        
    void review_find()throws Exception{
        //given
        
        //when
        
        //then
        
    
    }
}