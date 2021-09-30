package com.yzp.springdemo.mapper;

import com.yzp.springdemo.model.User;
import org.apache.ibatis.annotations.*;

/**
 * Author: YZP
 * Date: 2021/9/25
 * Time: 15:05
 */
@Mapper
public interface UserMapper {
    @Insert("insert into user(username,password) values(#{username},#{password})")
    void adduser(User user);

    @Select("select * from user where username = #{username}")
    User getuser(String username);

    @Select("select * from user where username = #{username} and password = #{password}")
    User login(String username, String password);

    @Delete("delete from user where username = #{username}")
    void deleteuser(String username);

    @Update("update user set password = #{password} where username = #{username}")
    void updateuser(String username, String password);

}