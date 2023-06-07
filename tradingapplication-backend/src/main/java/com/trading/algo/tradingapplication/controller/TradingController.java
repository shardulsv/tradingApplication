package com.trading.algo.tradingapplication.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TradingController {
	
	@PostMapping(path = "/handleSignal", produces = "application/json")
	@ResponseBody
	public ResponseEntity<String> handleSignal(int signal){
		
		
		return null;
		
	}

}
