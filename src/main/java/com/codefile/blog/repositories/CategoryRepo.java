package com.codefile.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codefile.blog.entities.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer> {

}
