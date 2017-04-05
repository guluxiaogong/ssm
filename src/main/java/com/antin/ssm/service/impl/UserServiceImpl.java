package com.antin.ssm.service.impl;

import com.antin.ssm.mapper.UserMapper;
import com.antin.ssm.model.UserModel;
import com.antin.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by win7 on 2017/4/4.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public void insert(UserModel userModel) {
        userMapper.insert(userModel);
    }

    @Override
    public void deleteById(Integer id) {
        userMapper.deleteById(id);
    }

    @Override
    public void update(UserModel userModel) {
        userMapper.update(userModel);
    }

    @Override
    public UserModel selectById(Integer id) {
        return userMapper.selectById(id);
    }

    @Override
    public List<UserModel> selectAll() {
        return userMapper.selectAll();
    }
}
