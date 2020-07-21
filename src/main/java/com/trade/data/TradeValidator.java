package com.trade.data;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.trade.model.Trade;

/**
 * Provides utility functions for checking trade validation
 * @author kamsing
 *
 */
public class TradeValidator {

	/**
	 * Validate trade date against today's date
	 * @param trade
	 * @return
	 */
	public static boolean dateValidation(Trade trade) {
		Date today = Calendar.getInstance().getTime();
		if(today.compareTo(trade.getMaturityDate())>0) {
			return false;
		}
		return true;
	}
	
	/**
	 * Update expire flag
	 * @param trade
	 */
	public static void updateExpireFlag(Trade trade) {
		Date today = Calendar.getInstance().getTime();
		if(today.compareTo(trade.getMaturityDate())>0) {
			trade.setExpired(true);;
		}
	}
	
	/**
	 * Check validation of trade
	 * @param trade
	 * @param oldTradeList
	 * @return
	 */
	public static boolean checkTradeVersion(Trade trade, List<Trade> oldTradeList) {
		boolean valid = true;
		for(Trade old: oldTradeList) {
			if(trade.getVersion()<old.getVersion()) {
				valid = false;
				break;
			}
		}
		return valid;
	}
	
	
}
