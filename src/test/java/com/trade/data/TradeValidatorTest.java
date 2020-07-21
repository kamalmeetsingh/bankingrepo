package com.trade.data;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Test;

import com.trade.model.Trade;

class TradeValidatorTest {

	/**
	 * Test Date Validation
	 */
	@Test
	void testDateValidation() {
		Trade trade = new Trade("T1", 1, "C1", new Date(), new Date(), false);
		boolean success = TradeValidator.dateValidation(trade);
		assertFalse(success);
	}
	
	/**
	 * Validate Expired Flag
	 */
	@Test
	void testExpiredFlag() {
		Trade trade = new Trade("T1", 1, "C1", new Date(), new Date(), false);
		TradeValidator.updateExpireFlag(trade);
		assertTrue(trade.isExpired());
	}

}
