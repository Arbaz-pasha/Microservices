package com.assesment.assesment1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
//@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
public class Assessment1Application {

	public static void main(String[] args) {
		SpringApplication.run(Assessment1Application.class, args);}

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}


}