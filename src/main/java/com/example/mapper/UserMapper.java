package com.example.mapper;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
@Resource(name="userMapper")
public interface UserMapper {
	@Select("SELECT COUNT(*) CNT FROM USERS WHERE UNAME=#{uname} AND PWD=#{pwd}")
	int hasUser(@Param("uname")String uname,@Param("pwd")String pwd);
}
