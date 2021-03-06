package Entities;

public final class CurrencyConverter {
	private static final double IOF = 0.06;
	private static final double dollar = 3.10;
	
	public static final double convert(double amount) {
		return (amount * dollar) * IOF + amount * dollar;
	}
}
