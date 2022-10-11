package com.microservice.apigatewaymicroservice;

import com.microservice.apigatewaymicroservice.jwt.entity.User;
import com.microservice.apigatewaymicroservice.jwt.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class ApiGatewayMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayMicroserviceApplication.class, args);
	}


	/*@Autowired
	private UserRepository userRepository;

	@PostConstruct
	public void initUsers() {

		List<User> users = Stream.of(
				new User(1, "aditya5194", "password", "abc@gmail.com"),
				new User(2, "aditya5111", "pwd", "abc1994@gmail.com"),
				new User(3, "aditya5112", "pwd", "abc5116@gmail.com")
		).collect(Collectors.toList()
		);

		userRepository.saveAll(users);
	}*/

}
