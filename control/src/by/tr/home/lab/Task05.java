package by.tr.home.lab;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {

		int n;

		int minElements;

//		int[] mas = { 1, 3, 8, 7, 4, 9, 10, 5, 11, 16, 12 };

		System.out.println("Введите количество элементов массива");

		n = getValue();

		int[] mas = new int[n];

		mas = init(mas);

		print(mas);

		minElements = getCountOfMinElements(mas);

		System.out.println("Минимальное количество элементов для удаления : " + minElements);

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

	private static int[] init(int[] mas) {

		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(20);
		}
		return mas;

	}

	private static void print(int[] mas) {

		for (int i = 0; i < mas.length; i++) {
			System.out.printf("%2d ", mas[i]);
		}
		System.out.println();

	}

	private static int getCountOfMinElements(int[] mas) {

		int countOfMinElements;

		int[] count = new int[mas.length];

		for (int i = 0; i < count.length; i++) {
			count[i] = 1;
		}

		for (int j = 1; j < mas.length; j++) {
			for (int i = 0; i < j; i++) {
				if (mas[j] > mas[i]) {
					if (count[j] <= count[i]) {
						count[j] = count[i] + 1;
					}
				}
			}
		}

//		print(count);
		Arrays.sort(count);
//		print(count);

		countOfMinElements = count.length - count[count.length - 1];

		return countOfMinElements;
	}

}
