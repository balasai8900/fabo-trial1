package com.pack.fabo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
@SpringBootApplication
public class SampleProjectApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(SampleProjectApplication.class, args); 
	}
@override
protected springApplicationBuilder configure(SpringApplicationBuilder application) {
 return application.sources(SecondInitialize.class);
}
}
