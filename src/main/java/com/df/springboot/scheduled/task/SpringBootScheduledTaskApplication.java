package com.df.springboot.scheduled.task;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringBootScheduledTaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootScheduledTaskApplication.class, args);
	}

}
