package test2;

import java.util.Random;

public class TestClass {
	public static void main(String[] args) {

		int[] a = new int[10];
		Random r = new Random();

		for (int i = 0; i < a.length; i++)
			a[i] = r.nextInt();

		int sum = 0;
		for (int i = 1; i < a.length - 1; i++) {
			sum += a[i];
		}

		System.out.println("Сумма всех элементов массива, кроме первого и последнего  = " + sum);

	}

}
