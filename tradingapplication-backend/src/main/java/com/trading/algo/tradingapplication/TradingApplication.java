package com.trading.algo.tradingapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class TradingApplication {
	
	private static Map<Integer, String> signalMap = new HashMap<>();

    public static void main(String[] args) {
        SpringApplication.run(TradingApplication.class, args);
        populateSignalMap();
    }

	private static void populateSignalMap() {
		signalMap.put(1, "test");
	}

}

