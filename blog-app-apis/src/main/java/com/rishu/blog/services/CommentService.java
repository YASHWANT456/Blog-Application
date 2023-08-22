package com.rishu.blog.services;

import com.rishu.blog.payloads.CommentDto;


public interface CommentService {
	
	public  CommentDto createComment(CommentDto commentDto,Integer postId);
	
	void deleteComment(Integer commentId);

}
