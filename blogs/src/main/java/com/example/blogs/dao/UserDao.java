package com.example.blogs.dao;

import com.example.blogs.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<User,Long> {
    User getUserById(Long id);
}
