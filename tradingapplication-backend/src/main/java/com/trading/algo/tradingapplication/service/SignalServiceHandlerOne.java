package com.trading.algo.tradingapplication.service;

import com.trading.algo.tradingapplication.thirdparty.Algo;

public class SignalServiceHandlerOne implements SignalServiceHandler {

	@Override
	public void handleSignal() {
		Algo algo = new Algo();
		
		algo.setUp();
		algo.setAlgoParam(1, 60);
		algo.performCalc();
		algo.submitToMarket();
		
	}

}
