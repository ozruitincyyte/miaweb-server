package com.incyyte.cloud.miawebserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MiawebServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiawebServerApplication.class, args);
	}
}
