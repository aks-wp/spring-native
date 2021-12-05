package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.nativex.hint.TypeHint;

import com.example.dependency.domain.Person;

@TypeHint(types = {Person.class})
@SpringBootApplication(scanBasePackages="com.example.dependency")
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
