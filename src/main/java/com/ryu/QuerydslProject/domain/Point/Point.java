package com.ryu.QuerydslProject.domain.Point;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Point {

    @Id@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
}