package com.fastGen;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication()
@MapperScan("com.fastGen.dao")
public class FastGenApplication {

	public static void main(String[] args) {
		SpringApplication.run(FastGenApplication.class, args);
	}
}
