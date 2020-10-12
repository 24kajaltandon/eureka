package com.sapient.pkg;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringApp1 {

	public static void main(String[] args) {
		SpringApplication.run(SpringApp1.class, args);
	}
}