package com.trade.data;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.trade.model.Trade;

class TradeDALTest {

	/**
	 * Test we are able to add trade
	 */
	@Test
	void testAddTrade() {
		TradeDAL tradeDAL = new TradeDAL();
		Trade trade = new Trade("T1", 1, "C1", new Date(), new Date(), false);
		boolean success = tradeDAL.addTrade(trade);
		assertTrue(success);
		
	}
	
	/**
	 * Test we are able to add and get trade
	 */
	@Test
	void testGetTrade() {
		TradeDAL tradeDAL = new TradeDAL();
		Trade trade = new Trade("T1", 1, "C1", new Date(), new Date(), false);
		boolean success = tradeDAL.addTrade(trade);
		assertTrue(success);
		List<Trade> list = tradeDAL.getTrade(trade.getTradeId());
		assertEquals(list.size(), 1);
		
	}

}
