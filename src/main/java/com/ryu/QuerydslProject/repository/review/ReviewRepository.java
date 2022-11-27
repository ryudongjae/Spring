package com.ryu.QuerydslProject.repository.review;

import com.ryu.QuerydslProject.domain.review.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepository extends JpaRepository<Review,Long> {
    List<Review> findAllByLectureId(Long lectureId);
}
