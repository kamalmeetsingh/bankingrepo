package com.trade.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.trade.model.Trade;

/**
 * Data Access class for Trade
 * @author kamsing
 *
 */
public class TradeDAL {
	
	Map<String, List<Trade>> tradeMap = new HashMap<String, List<Trade>>();

	public boolean addTrade(Trade trade) {
		// TODO add trade data to database
		// for now adding to Map
		
		boolean tradeAdded = false;
		// date validation
		TradeValidator.dateValidation(trade);
		// get existing
		if(tradeMap.containsKey(trade.getTradeId())) {
			
			List<Trade> list = tradeMap.get(trade.getTradeId());
			// version validation
			TradeValidator.checkTradeVersion(trade, list);
			list.add(trade);
			tradeMap.put(trade.getTradeId(), list);
			tradeAdded = true;
		}
		else
		{
			List<Trade> list = new ArrayList<Trade>();
			list.add(trade);
			tradeMap.put(trade.getTradeId(), list);
			tradeAdded = true;
		}
		return tradeAdded;
	}
	
	public List<Trade> getTrade(String tradeId) {
		// TODO get trade data to database
		List<Trade> list = tradeMap.get(tradeId);
		for(Trade trade: list) {
			TradeValidator.updateExpireFlag(trade);
		}
		return list;
	}
}
