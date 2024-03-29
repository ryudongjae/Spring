package com.ryu.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
public class UserBase extends BaseTimeEntity {

    @Id@GeneratedValue
    @Column(name = "user_id")
    private Long id;

    @Embedded
    private LoginBase loginBase;

}
