package com.example.demo.dao;

import com.example.demo.pojo.OneUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserDao {
    Integer findByName(Integer name);
}
