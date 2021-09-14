package homework5;

public class Stock {
	String symbol;
	String name;
	double previousClosingPrice;
	double currentPrice;
	
	public Stock(String symbol, String name) {
		this.symbol = symbol;
		this.name = name;
		
	}
	
	public String getSymbol() {
		return symbol;
	}
	public String getName() {
		return name;
	}
	public double getPreviousClosingPrice() {
		return previousClosingPrice;
	}
	
	public void setPreviousClosingPrice(double previousClosingPrice) {
		this.previousClosingPrice = previousClosingPrice;
	}
	
	public double getCurrentPrice() {
		return currentPrice;
	}
	
	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}
	
	public String changePercent() {
		double percentChange =((this.currentPrice - this.previousClosingPrice)/(Math.abs(previousClosingPrice))) * 100;
		return "" + percentChange;
	}

}
