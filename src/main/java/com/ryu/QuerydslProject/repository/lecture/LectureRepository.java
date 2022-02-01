package com.ryu.QuerydslProject.repository.lecture;

import com.ryu.QuerydslProject.domain.Lecture.Lecture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LectureRepository extends JpaRepository<Lecture,Long> {
    List<Lecture> findByLectureNameAndTeacherName(String lectureName, String teacherName);
}
