package com.hust.be.dao;

import com.hust.be.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by mzYan on 2020-07-18 14:19
 */
public interface UserRepository extends JpaRepository<User, Long> {
   User findByUsernameAndPassword(String username, String password);
}
