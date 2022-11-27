package com.ryu.QuerydslProject.service.user;

import com.ryu.QuerydslProject.domain.member.User;
import com.ryu.QuerydslProject.repository.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;


    /**
     * 회원가입
     */
    public void saveUser(User user) {
        validateDuplicateMember(user);
        userRepository.save(user);
    }

    // 회원 전체 조회
    @Transactional(readOnly = true)
    public List<User> findUsers() {
        return userRepository.findAll();
    }

    // 회원 하나 조회
    @Transactional(readOnly = true)
    public User findOne(Long userId) {
        return userRepository.findById(userId).orElseThrow();
    }

    @Transactional(readOnly = true)
    public List<User> findByName(String userName) {
        if (userName == null) {
            throw new NullPointerException("회원 이름이 입력되지 않았습니다.");
        }
        return userRepository.findByUserName(userName);
    }

    private void validateDuplicateMember(User user) {
        List<User> findMembers = userRepository.findByUserName(user.getUserName());
        if (!findMembers.isEmpty()) {
            throw new IllegalStateException("이미 존재하는 회원입니다.");
        }
    }
}
