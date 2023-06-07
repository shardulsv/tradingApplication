package com.trading.algo.tradingapplication.service;

import com.trading.algo.tradingapplication.thirdparty.Algo;

public class SignalServiceHandlerTwo implements SignalServiceHandler {

	@Override
	public void handleSignal() {
		Algo algo = new Algo();
		
		algo.reverse();
		algo.setAlgoParam(1, 80);
		algo.submitToMarket();
	}

}
