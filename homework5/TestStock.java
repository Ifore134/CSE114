package homework5;

public class TestStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stock google = new Stock("GOOG", "Google Inc.");
		google.setCurrentPrice(90);
		google.setPreviousClosingPrice(100);
		System.out.println(google.changePercent());
		
		Stock facebook = new Stock("FB", "Facebook Inc.");
		facebook.setCurrentPrice(354.70);
		facebook.setPreviousClosingPrice(354.39);
		System.out.println(facebook.changePercent());
		
		Stock amazon = new Stock("AMZN", "Amazon.com Inc.");
		amazon.setCurrentPrice(3510.98);
		amazon.setPreviousClosingPrice(3432.97);
		System.out.println(amazon.changePercent());
		

	}

}
