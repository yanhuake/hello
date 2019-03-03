package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages= {"com.example.controller","com.example.service.impl"})
@MapperScan(value="com.example.mapper")
public class YhkApplication {

	public static void main(String[] args) {
		SpringApplication.run(YhkApplication.class, args);
	}

}
