package com.trading.algo.tradingapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.trading.algo.tradingapplication.service.SignalServiceHandler;
import com.trading.algo.tradingapplication.service.SignalServiceHandlerOne;
import com.trading.algo.tradingapplication.service.SignalServiceHandlerThree;
import com.trading.algo.tradingapplication.service.SignalServiceHandlerTwo;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class TradingApplication {
	
	private static Map<Integer, SignalServiceHandler> signalMap = new HashMap<>();

    public static void main(String[] args) {
        SpringApplication.run(TradingApplication.class, args);
        populateSignalMap();
    }

	private static void populateSignalMap() {
		signalMap.put(1, new SignalServiceHandlerOne());
		signalMap.put(2, new SignalServiceHandlerTwo());
		signalMap.put(3, new SignalServiceHandlerThree());
	}
	
	public static Map<Integer, SignalServiceHandler> getSignalMap(){
		return signalMap;
	}

}

