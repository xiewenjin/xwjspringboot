package net.xwjclass.demo.service;

import net.xwjclass.demo.domain.UserTable;
import net.xwjclass.demo.mapper.UserMapper;
import org.apache.catalina.User;

import java.util.List;

public interface UserService {

    public int add(UserTable user);

    public List<UserTable> getAll();


}
