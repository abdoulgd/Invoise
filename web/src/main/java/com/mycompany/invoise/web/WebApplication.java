package com.mycompany.invoise.web;

import com.fasterxml.jackson.datatype.hibernate5.Hibernate5Module;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication /*(scanBasePackages = {"com.mycompany.invoise.core", "com.mycompany.invoise.web"})*/
@ComponentScan(basePackages = {"com.mycompany.invoise.core", "com.mycompany.invoise.web"})
@EnableJpaRepositories(basePackages="com.mycompany.invoise.core.repository")
@EntityScan(basePackages = "com.mycompany.invoise.core.entity")
public class WebApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebApplication.class, args);
	}

	@Bean
	public Hibernate5Module datatypeHibernateModule() {
		return new Hibernate5Module();
	}

}
