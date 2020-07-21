package com.trade.demo;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.logger.ConsoleLogger;
import com.logger.ILogger;
import com.trade.model.Trade;
import com.trade.service.TradeService;

/**
 * Controller class managing APIs
 * @author kamsing
 *
 */
@RestController
@RequestMapping("trade")
public class TradeController {
	static ILogger logger = new ConsoleLogger();
	/**
	 * Post method to add trade
	 * @param input
	 * @return
	 */
	@PostMapping("/")
	public Boolean addTrade(@RequestBody Trade input) {
		logger.logInfo("Starting execution");
		Boolean success = false;
		TradeService tradeService = new TradeService();
		success = tradeService.addTrade(input);
		logger.logInfo("Ended execution");
		return success;
	}
	
	/**
	 * Get trades for a trade id
	 * @param id
	 * @return
	 */
	@GetMapping("/{id}")
	public List<Trade> getTrades(@PathVariable("id") String id){
		logger.logInfo("Starting execution");
		TradeService tradeService = new TradeService();
		logger.logInfo("Ended execution");
		return tradeService.getTrades(id);
	}

}
