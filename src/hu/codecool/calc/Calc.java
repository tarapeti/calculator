package hu.codecool.calc;

public class Calc {

	public static double divide(double a, double b) {
		if(b == 0) {
			throw new ArithmeticException("can't divide by 0");
		}
		return a / b;
	}
	public static double add(double a, double b) {
		return a + b;
	}
	public static double subtrackt(double a, double b) {
		return a - b;
	}
	public static double multiply(double a, double b) {
		return a * b;
	}
}
