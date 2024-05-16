package com.org.mapper;

import com.org.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface UserMapper {
    int insertUser(User user);

    int deleteById(@Param("id") Integer id);

    int updateUser(User user);

    User selectById(@Param("id") Integer id);

    List<User> selectAll();
}
