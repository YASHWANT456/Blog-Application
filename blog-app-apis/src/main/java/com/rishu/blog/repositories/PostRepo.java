package com.rishu.blog.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rishu.blog.entity.Category;
import com.rishu.blog.entity.Post;
import com.rishu.blog.entity.User;

public interface PostRepo extends JpaRepository<Post,Integer> {
	
	// find all post of user
	List<Post> findByUser(User user);
	// find all post of user by category
	List<Post> findByCategory(Category category);
	
	List<Post>findByTitleContaining(String title);
	

}
