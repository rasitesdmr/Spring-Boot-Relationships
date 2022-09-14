package com.example.springbootrelationships;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class SpringBootRelationshipsApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootRelationshipsApplication.class, args);
	}

}
