package com.trading.algo.tradingapplication.service;

import com.trading.algo.tradingapplication.thirdparty.Algo;

public class SignalServiceHandlerThree implements SignalServiceHandler{

	@Override
	public void handleSignal() {
		Algo algo = new Algo();
		
		algo.setAlgoParam(1, 90);
		algo.setAlgoParam(1, 15);
		algo.performCalc();
		algo.submitToMarket();
	}

}
