package com.trade.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.trade.data.TradeDAL;
import com.trade.model.Trade;

class TradeServiceTest {

	/**
	 * Test add trade service
	 */
	@Test
	void testAddTrade() {
		TradeService tradeService = new TradeService();
		Trade trade = new Trade("T1", 1, "C1", new Date(), new Date(), false);
		boolean success = tradeService.addTrade(trade);
		assertTrue(success);
	}

	/**
	 * Test Get trade service
	 */
	@Test
	void testGetTrade() {
		TradeService tradeService = new TradeService();
		Trade trade = new Trade("T1", 1, "C1", new Date(), new Date(), false);
		boolean success = tradeService.addTrade(trade);
		assertTrue(success);
		List<Trade> list = tradeService.getTrades(trade.getTradeId());
		assertEquals(list.size(), 1);
		
	}
}
