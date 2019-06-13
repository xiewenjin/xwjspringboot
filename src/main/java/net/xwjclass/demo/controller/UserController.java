package net.xwjclass.demo.controller;


import net.xwjclass.demo.domain.CustomExtHandlerMy;
import net.xwjclass.demo.domain.UserTable;
import net.xwjclass.demo.mapper.UserMapper;
import net.xwjclass.demo.service.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/api/insert")
    public Object insert(){

        UserTable user = new UserTable();
        user.setAge(11);
        user.setCreateTime(new Date());
        user.setName("xdclass");
        user.setPhone("30010000");


        try {
            userService.add(user);

        }catch (Exception e){
            throw new CustomExtHandlerMy("500",e.getMessage());
        }

        return user;
    }


    @GetMapping("/api/getall")
    public Object getUserAll(){
        //return userMapper.getAll();
        return userService.getAll();
    }
}
