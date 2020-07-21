package com.trade.service;

import java.util.List;

import com.trade.data.TradeDAL;
import com.trade.model.Trade;

/**
 * Service layer for managing Trades
 * @author kamsing
 *
 */
public class TradeService {
	
	TradeDAL tradeDAL;
	
	public TradeService(){
		tradeDAL = new TradeDAL();
	}
	
	/**
	 * Add trade to existing set of trades
	 * @param trade
	 * @return
	 */
	public boolean addTrade(Trade trade) {
		return tradeDAL.addTrade(trade);
	}
	
	/**
	 * Get trade details for trade id
	 * @param tradeId
	 * @return
	 */
	public List<Trade> getTrades(String tradeId){
		return tradeDAL.getTrade(tradeId);
	}

}
