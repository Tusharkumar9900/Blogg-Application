package com.codefile.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codefile.blog.entities.Role;

public interface RoleRepo  extends JpaRepository<Role, Integer>{

}
