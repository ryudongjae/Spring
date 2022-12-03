package com.ryu.demo.user;

import com.ryu.demo.apply.Apply;
import com.ryu.demo.board.Board;
import com.ryu.demo.comment.Comment;
import com.ryu.demo.likes.Likes;
import com.ryu.demo.model.UserBase;
import com.ryu.demo.portfolio.Portfolio;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class User  extends UserBase {

    @OneToMany(mappedBy = "user" , fetch = FetchType.LAZY)
    private List<Board> boardList = new ArrayList<>();

    @OneToMany(mappedBy = "user" , fetch = FetchType.LAZY)
    private List<Likes> likesList = new ArrayList<>();

    @OneToMany(mappedBy = "author" , fetch = FetchType.LAZY)
    private List<Comment> commentList = new ArrayList<>();

    @OneToMany(mappedBy = "volunteer" , fetch = FetchType.LAZY)
    private List<Apply> applyList = new ArrayList<>();

    @OneToOne
    @JoinColumn(name = "portfolio_id")
    private Portfolio portfolio;
}
