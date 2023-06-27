package com.punam.department;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;


@OpenAPIDefinition(
		info = @Info(
				title = "Department Service REST APIs",
				description = "Department Service REST APIs Documentation",
				version = "v1.0",
				contact = @Contact(
							name = "Punam Jasud",
							email = "punam@gmail.com",
							url = "http://javanetguides.com"
							
				),
				license = @License(
							name = "Apache 2.0",
							url = "http://javanetguides.com"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "Department-Service Doc",
				url = "http://javanetguides.com"
		)
)


@SpringBootApplication
public class DepartmentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DepartmentServiceApplication.class, args);
	}

}
