package by.tr.home.lab;

import static java.lang.Math.*;

public class Task01 {

	public static void main(String[] args) {

		double x = 1.0;
		double y = 1.0;
		double result;

		result = getNumerator(x, y) / (getDenominator(x, y)) + x;

		System.out.printf("result = %.3f", result);

	}

	private static double getModule(double x, double y) {

		return abs(x - (2 * x) / (1 + x * x * y * y));

	}

	private static double getDenominator(double x, double y) {
		return 2 + getModule(x, y);
	}

	private static double getNumerator(double x, double y) {

		return 1 + sin(x + y) * sin(x + y);

	}

}
