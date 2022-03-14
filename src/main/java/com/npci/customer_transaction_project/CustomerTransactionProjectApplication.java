package com.npci.customer_transaction_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//import springfox.documentation.swagger2.annotations.EnableSwagger2;



@SpringBootApplication
@EnableCaching
@EnableJpaRepositories()


public class CustomerTransactionProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerTransactionProjectApplication.class, args);
	}

}
