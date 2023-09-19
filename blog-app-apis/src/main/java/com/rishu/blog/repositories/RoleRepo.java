package com.rishu.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rishu.blog.entity.Role;

public interface RoleRepo extends JpaRepository<Role,Integer>{

}
