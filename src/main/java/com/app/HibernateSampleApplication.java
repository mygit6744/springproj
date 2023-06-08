package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.controller","com.entity","com.hibernate.dao","com.jps.repository",
	"com.service","com.app","com.dto","com.exception","com.jdbc"})
@EnableJpaRepositories("com.jps.repository") 
@EntityScan("com.entity")   
public class HibernateSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(HibernateSampleApplication.class, args);
		
	}

}
