package com.ryu.QuerydslProject.repository.point;

import com.ryu.QuerydslProject.domain.point.Point;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PointRepository extends JpaRepository<Point, Long> {
}
