package com.example.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;
import java.util.logging.Logger;


@SpringBootApplication
@EnableZipkinServer
public class Application {

	protected Logger logger = Logger.getLogger(Application.class.getName());
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
