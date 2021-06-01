package com.niranjan2021.businessservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.lang.invoke.MethodHandles;
import java.util.logging.Logger;


@SpringBootApplication
@EnableDiscoveryClient
public class BusinessServiceApplication {

	public final  static Logger logger = Logger.getLogger(String.valueOf(MethodHandles.lookup().lookupClass()));

	public static void main(String[] args) {

		SpringApplication.run(BusinessServiceApplication.class, args);
	}

}
