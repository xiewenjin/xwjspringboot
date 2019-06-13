package net.xwjclass.demo.service.impl;

import net.xwjclass.demo.domain.UserTable;
import net.xwjclass.demo.mapper.UserMapper;
import net.xwjclass.demo.service.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserMapper userMapper;

    @Override
    public int add(UserTable user) {

        userMapper.insert(user);
        return 0;
    }

    @Override
    public List<UserTable> getAll() {

        return userMapper.getAll();

    }


}
