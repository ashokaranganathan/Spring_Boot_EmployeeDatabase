package com.employee.database.employee_database;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(
	info = @Info(
		title = "Spring Boot REST API Application (Employee Database)",
		description = "Spring Boot REST API Application (Employee Database)",
		version= "v1.0",
		contact= @Contact( 
			name = "Ashok Aranganathan",
			email = "ashokaranganathan@gmail.com"
		)
	)
)
public class EmployeeDatabaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeDatabaseApplication.class, args);
	}

}
