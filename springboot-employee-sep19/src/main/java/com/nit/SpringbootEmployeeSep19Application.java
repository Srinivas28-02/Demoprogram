package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class SpringbootEmployeeSep19Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootEmployeeSep19Application.class, args);
	}

}
