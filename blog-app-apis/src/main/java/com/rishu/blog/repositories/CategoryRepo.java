package com.rishu.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rishu.blog.entity.Category;

public interface CategoryRepo extends JpaRepository<Category,Integer> {

}
