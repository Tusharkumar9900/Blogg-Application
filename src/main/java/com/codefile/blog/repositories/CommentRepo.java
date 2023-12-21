package com.codefile.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codefile.blog.entities.Comment;

public interface CommentRepo  extends JpaRepository<Comment	, Integer> {

}
