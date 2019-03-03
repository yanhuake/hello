package com.example.mapper;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
@Resource(name="userMapper")
public interface UserMapper {
	@Select("SELECT COUNT(*) CNT FROM USERS WHERE UNAME=#{name} AND PWD=#{pwd}")
	int hasUser(@Param("name")String username,@Param("pwd")String password);
}
