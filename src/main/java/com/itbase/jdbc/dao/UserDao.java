package com.itbase.jdbc.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.itbase.jdbc.entity.User;

public interface UserDao extends JpaRepository<User,Integer>{

}
