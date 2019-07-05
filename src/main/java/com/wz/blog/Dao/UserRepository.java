package com.wz.blog.Dao;

import com.wz.blog.po.User;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * interface userRepository
 *
 * */
public interface UserRepository extends JpaRepository<User,Long> {
    User findByUsernameAndPassword(String username, String password);
}
