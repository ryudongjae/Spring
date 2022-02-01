package com.ryu.QuerydslProject.service;

import com.ryu.QuerydslProject.domain.Lecture.Lecture;
import com.ryu.QuerydslProject.dto.LectureDto;
import com.ryu.QuerydslProject.repository.lecture.LectureRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class LectureService {

    private final LectureRepository lectureRepository;
    @Transactional(readOnly = true)
    public FileInfo fileSaveAndParsing(MultipartFile multipartFile) throws IOException {

        FileInfo fileInfo = new FileInfo();

        if (multipartFile.isEmpty()) {
            fileInfo.setFileName("");
            fileInfo.setFilePath("");
            fileInfo.setFileSize(0);
            return fileInfo;
        }

        String[] strArray = multipartFile.getOriginalFilename().split("\\.");
        log.info("origin type : {}", strArray[strArray.length-1]);
        String fileName = "" + LocalDate.now() + System.nanoTime() + "." + strArray[strArray.length-1];

        String absolutePath = new File("").getAbsolutePath() + "/src/main/resources/static/images/represent/";
        String path = "/images/represent/" + fileName;

        log.info("type : {}, name : {}, path : {}", multipartFile.getContentType(), fileName, path);

        File file = new File(absolutePath + fileName);

        if (!file.exists()) {
            file.mkdirs();
        }

        multipartFile.transferTo(file);

        fileInfo.setFileName(fileName);
        fileInfo.setFileSize(multipartFile.getSize());
        fileInfo.setFilePath(path);
        return fileInfo;
    }

    // 조인
    public Lecture join(Lecture lecture) {
        validateDuplicateLecture(lecture);
//        return lectureJpaRepository.save(lecture);
        return lectureRepository.save(lecture);
    }

    private void validateDuplicateLecture(Lecture lecture) {
//        List<Lecture> findLectures = lectureJpaRepository.findByName(lecture.getLectureName(), lecture.getTeacherName());
        List<Lecture> findLectures = lectureRepository.findByLectureNameAndTeacherName(lecture.getLectureName(), lecture.getTeacherName());
        if (!findLectures.isEmpty()) {
            throw new IllegalStateException("이미 존재하는 강의입니다.");
        }
    }

    // 업데이트
    public void update(Long id, LectureDto lectureDto) {
        Lecture findLecture = lectureRepository.findById(id).orElseThrow();
        findLecture.changeLectureData(lectureDto.getLectureName(), lectureDto.getTeacherName(), lectureDto.getContent(),
                lectureDto.getRepresentImagePath(), lectureDto.getRepresentImageSize(), lectureDto.getRepresentImageName(),
                lectureDto.getSiteName(), lectureDto.getUri());
    }

    // 조회
    @Transactional(readOnly = true)
    public List<Lecture> findAll() {
//        return lectureJpaRepository.findAll();
        return lectureRepository.findAll();
    }

    public Lecture findById(Long id) {
        return lectureRepository.findById(id).orElseThrow();
    }

    // review refresh
    public void refreshAverageRating(Long lectureId) {
        Lecture findLecture = lectureRepository.findById(lectureId).orElseThrow();
        findLecture.calculateAverageRating();
    }

    // delete review
    public void deleteReview(Long lectureId, Long reviewId) {
        Lecture findLecture = lectureRepository.findById(lectureId).orElseThrow();
        findLecture.removeReview(reviewId);
    }
}

