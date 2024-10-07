package com.bptn.course._big_coding_challenge_weektwo;

public class Stock {

	// Create instance variables
	private String tickerSymbol;
	private String companyName;
	private int price;
	private double percentChange; // default percentChange
	private int totalShares; // to calculate total shares
	private long marketCap; // calculate market cap

	// Constructor
	public Stock(String tickerSymbol, String companyName, int price, int totalShares) {
		this.tickerSymbol = tickerSymbol.toUpperCase(); // this is to ensure ticker su=ymbol is in uppdercase
		this.companyName = companyName;
		this.price = price;
		this.totalShares = totalShares;
		this.percentChange = 0.00;
		this.marketCap = totalShares * price;
	}

	// Create the methods
	public void adjustPrice(int change) {
		// calculate new price
		this.price += change;

		// calculate the percent change (change / current price*100)
		percentChange = ((double) change / price) * 100;

		// calculate market Cap
		marketCap = (long) totalShares * price;
	}

	public String toString() {
		return "Ticker Symbol: " + tickerSymbol + "\n" + "Company: " + companyName + "\n" + "Current Price: $ " + price
				+ "(" + percentChange + "%) \n" + "Market Cap: $" + marketCap;

	}
}
