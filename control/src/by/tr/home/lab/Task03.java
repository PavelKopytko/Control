package by.tr.home.lab;

public class Task03 {

	public static void main(String[] args) {

		int a = 1;
		int b = 5;
		double h = 0.1;

		double function;

		System.out.printf("|\t%s\t|\t%s\t|\n", "x", "F(x)");
		System.out.println("_________________________________");

		for (double i = a; i <= b; i += h) {
			function = Math.tan(i);
			System.out.printf("|\t%2.2f\t|\t%2.2f\t|\n", i, function);
		}

	}

}
