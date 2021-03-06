package com.milu.vote.service.impl;

import com.milu.vote.bean.User;
import com.milu.vote.mapper.UserMapper;
import com.milu.vote.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserMapper userMapper;

    @Override
    public Boolean save(User user) {
        user.setId(UUID.randomUUID().toString());
        userMapper.save(user);
        return true;
    }

    @Override
    public Boolean delete(String id) {
        userMapper.delete(id);
        return true;
    }

    @Override
    public Boolean update(User user) {
        userMapper.update(user);
        return true;
    }

    @Override
    public List<User> list(User user) {
        List<User> list = userMapper.list(user);
        return list;
    }

    @Override
    public User query(String id) {
        User user = userMapper.query(id);
        return user;
    }

}
