package com.app.birthday;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import security.ApplicationSecurityConfiguration;

@SpringBootApplication
@ComponentScan({"controller,service"})
@EnableJpaRepositories("dao")
@EntityScan("entity")
@Import({ApplicationSecurityConfiguration.class})
public class BirthdayApplication {

	public static void main(String[] args) {

		SpringApplication.run(BirthdayApplication.class, args);
	}
}
