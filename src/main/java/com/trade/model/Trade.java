package com.trade.model;

import java.util.Date;

/**
 * Model class managing trade data
 * @author kamsing
 *
 */
public class Trade {
	
	String tradeId;
	int version;
	String counterPartyId;
	Date maturityDate;
	Date createdDate;
	boolean expired;
	
	public Trade() {
		
	}
	
	public Trade(String tradeId, int version, String counterPartyId, Date maturityDate, Date createdDate, boolean expired) {
		this.tradeId = tradeId;
		this.version = version;
		this.counterPartyId = counterPartyId;
		this.maturityDate = maturityDate;
		this.createdDate = createdDate;
		this.expired = expired;
	}
	
	public String getTradeId() {
		return tradeId;
	}
	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	public String getCounterPartyId() {
		return counterPartyId;
	}
	public void setCounterPartyId(String counterPartyId) {
		this.counterPartyId = counterPartyId;
	}
	public Date getMaturityDate() {
		return maturityDate;
	}
	public void setMaturityDate(Date maturityDate) {
		this.maturityDate = maturityDate;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public boolean isExpired() {
		return expired;
	}
	public void setExpired(boolean expired) {
		this.expired = expired;
	}
	

}
