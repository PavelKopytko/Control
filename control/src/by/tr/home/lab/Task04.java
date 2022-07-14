package by.tr.home.lab;

import java.util.Random;
import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {

		int n;
		int[] mas;

		System.out.println("Введите количество элементов массива");

		n = getValue();

		mas = new int[n];

		mas = init(mas);

		print(mas);

		isPrime(mas);

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
		System.out.println();

	}

	private static void isPrime(int[] array) {
		int countPrime = 0;
		for (int i = 0; i < array.length; i++) {
			int count = 0;
			for (int j = 1; j <= array[i]; j++) {
				if (array[i] % j == 0) {
					count++;
				}
			}
			if (count == 2) {
//				System.out.println("Простое число " + mas[i]);
				System.out.println("Простое число в ячейке с индексом " + i);
				countPrime++;
			}
		}
		if (countPrime == 0) {
			System.out.println("Простых чисел нет");
		}
	}

}
