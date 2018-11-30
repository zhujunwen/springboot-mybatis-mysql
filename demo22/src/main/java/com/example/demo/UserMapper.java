package com.example.demo;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
public interface UserMapper {
    int deleteByPrimaryKey(int id);

    int insert(User user);

    int insertSelective(User user);

    User selectByPrimaryKey(int id);

    int updateByPrimaryKeySelective(User user);

    int updateByPrimaryKey(User user);
    //这个方式我自己加的
    List<User> selectAllUser();
}
