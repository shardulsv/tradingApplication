package com.trading.algo.tradingapplication.service;

import org.springframework.stereotype.Service;
import com.trading.algo.tradingapplication.TradingApplication;

@Service
public class HandleSignalService {
	
	public String handleSignal(int signal) {
		SignalServiceHandler signalServiceHandler = TradingApplication.getSignalMap().get(signal);
		if(signalServiceHandler != null) {
			signalServiceHandler.handleSignal();
			return "success";
		}else {
			return "fail";
		}
	}
}
