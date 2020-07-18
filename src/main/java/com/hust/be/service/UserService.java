package com.hust.be.service;

import com.hust.be.entity.User;

/**
 * Created by mzYan on 2020-07-18 14:17
 */
public interface UserService {
    User checkUser(String username, String password);
}
