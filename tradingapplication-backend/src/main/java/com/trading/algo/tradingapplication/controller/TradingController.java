package com.trading.algo.tradingapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.trading.algo.tradingapplication.service.HandleSignalService;

@RestController
public class TradingController {
	
	private final HandleSignalService handleSignalService;
	
	@Autowired
	public TradingController(HandleSignalService handleSignalService)  {
		this.handleSignalService = handleSignalService;
	}
	
	@PostMapping(path = "/handleSignal", produces = "application/json")
	@ResponseBody
	public ResponseEntity<String> handleSignal(int signal){
		return new ResponseEntity<>(handleSignalService.handleSignal(signal), HttpStatus.OK);
	}

}
