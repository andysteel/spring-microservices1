package com.gmail.andersoninfonet.clouduser.service;

import java.util.List;

import com.gmail.andersoninfonet.clouduser.model.User;

public interface UserService {
    User save(User user);

    User findByUsername(String username);

    List<String> findUsers(List<Long> idList);
}