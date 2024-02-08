package org.aelion.myownserviceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MyOwnServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyOwnServiceRegistryApplication.class, args);
	}

}
