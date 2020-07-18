package com.hust.be.serviceImpl;

import com.hust.be.dao.UserRepository;
import com.hust.be.entity.User;
import com.hust.be.service.UserService;
import com.hust.be.utils.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by mzYan on 2020-07-18 14:18
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User checkUser(String username, String password) {
        User user = userRepository.findByUsernameAndPassword(username, MD5Utils.code(password));
        return user;
    }
}
