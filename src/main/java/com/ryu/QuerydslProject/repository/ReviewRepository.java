package com.ryu.QuerydslProject.repository;

import com.ryu.QuerydslProject.domain.Review.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepository extends JpaRepository<Review,Long> {
    void saveWithLecture(Review review);

    List<Review> findAllByLectureId(Long lectureId);
}
