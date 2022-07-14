package by.tr.home.lab;

import java.util.Random;
import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {

		int n;
		int[] mas;
		int countUpper15 = 0;
		int sum = 0;

		System.out.println("Введите количество чисел");

		n = getValue();

		mas = new int[n];

		mas = init(mas);

		System.out.println("Массив чисел");

		print(mas);

		countUpper15 = getCountUpper15(mas);

		sum = getCount(mas);

		System.out.println();

		System.out.println("Количество чисел больше 15 или меньше 2 = " + countUpper15);
		System.out.println("Сумма чисел, которые делятся на 5 с остатком 4 = " + sum);

	}

	private static int getValue() {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		while (!scanner.hasNextInt()) {
			scanner.nextLine();
			System.out.println("Введено некорректное значение. Введите значени еще раз");
		}
		return scanner.nextInt();
	}

	private static int[] init(int[] array) {

		Random rand = new Random();

		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(100);
		}
		return array;

	}

	private static void print(int[] array) {

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}

	private static int getCountUpper15(int[] array) {

		int m = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] > 15 || array[i] < 2) {
				m++;
			}
		}
		return m;

	}

	private static int getCount(int[] array) {

		int sum = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] % 5 == 4) {
				sum += array[i];
			}
		}
		return sum;

	}

}
