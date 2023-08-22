package com.rishu.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rishu.blog.entity.Comment;

public interface CommentRepo extends JpaRepository<Comment,Integer> {

}
