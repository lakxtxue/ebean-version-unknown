package com.example.demo;

import io.ebean.Database;
import io.ebean.DatabaseFactory;
import io.ebean.EbeanVersion;
import io.ebean.config.DatabaseConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		DatabaseConfig config = new DatabaseConfig();
		config.loadFromProperties();
		config.setName("db");
		config.setDefaultServer(true);
		config.setDataTimeZone("GMT+8:00");
		Database database = DatabaseFactory.create(config);
		System.out.println(EbeanVersion.getVersion());
	}

}
