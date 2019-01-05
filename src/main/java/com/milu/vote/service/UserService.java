package com.milu.vote.service;

import com.milu.vote.bean.User;

import java.util.List;

public interface UserService {

    Boolean save(User user);

    Boolean delete(String id);

    Boolean update(User user);

    List<User> list(User user);

    User query(String id);
}
