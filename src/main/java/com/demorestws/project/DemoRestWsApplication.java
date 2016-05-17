package com.demorestws.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

@SpringBootApplication
public class DemoRestWsApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(DemoRestWsApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(demoRestWsApplicationClass);
	}

	private static Class<DemoRestWsApplication> demoRestWsApplicationClass = DemoRestWsApplication.class;
}
