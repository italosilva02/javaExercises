package util;

public class info {

	public static double IOF = 0.06;
	
	public static double doollarToReal (Double amount, double dollarPrice) {
		return amount * dollarPrice * (1.0 + IOF);
	}
	
	
}
