package com.ryu.demo.model;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@EntityListeners(AuditingEntityListener.class)
@Getter
@MappedSuperclass
public class BaseTimeEntity {


    @CreatedDate //생성시간
    @Column(updatable = false) //insertable=false는 insert 시점에 막는 것이고, updatable는 update 시점에 막는 기능입니다.
    private LocalDateTime createDate;

    @LastModifiedDate //변경시간
    private LocalDateTime modifiedDate;
}
