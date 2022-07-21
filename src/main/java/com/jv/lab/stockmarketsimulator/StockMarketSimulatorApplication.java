package com.jv.lab.stockmarketsimulator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class StockMarketSimulatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(StockMarketSimulatorApplication.class, args);
	}

}
