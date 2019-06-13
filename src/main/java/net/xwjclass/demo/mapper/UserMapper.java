package net.xwjclass.demo.mapper;

import net.xwjclass.demo.domain.UserTable;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;


@Component(value = "UserMapper")
public interface UserMapper {

    @Insert("INSERT INTO user(name,phone,create_time,age) VALUES(#{name}, #{phone}, #{createTime},#{age})")
    @Options(useGeneratedKeys=true, keyProperty="id", keyColumn="id")   //keyProperty java对象的属性；keyColumn表示数据库的字段
    int insert(UserTable user);


    @Select("Select * from user")
    @Results({
            @Result(column="create_time",property = "createTime")
    })
    List<UserTable> getAll();
}
