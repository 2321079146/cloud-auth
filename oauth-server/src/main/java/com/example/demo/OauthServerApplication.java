package com.example.demo;

import com.example.demo.db.User;
import com.example.demo.db.UserMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.example.demo.db")
public class OauthServerApplication implements CommandLineRunner {

	private final UserMapper userMapper;

	public OauthServerApplication(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

	@Override
	public void run(String... args) {
		User user = this.userMapper.findByUserName("admin");
		if(user != null){
			System.out.println("================: "+user.getUsername());
		}
	}

	public static void main(String[] args) {
		SpringApplication.run(OauthServerApplication.class, args);
	}

}
