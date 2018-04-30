package test2;

import java.util.Arrays;

public class TestClass {

	static boolean equals(short[] a1, short[] a2) {

		if (a1.length != a2.length)
			return false;

		for (int i = 0; i < a1.length; i++) {
			if (a1[i] != a2[i])
				return false;
		}
		return true;
	}

	public static void main(String[] args) {

		short[] a1 = { 1, 2, 3, 4 };
		short[] a2 = { 1, 2, 3, 4 };
		short[] a3 = { 1, 3, 6, 7, 8 };
		short[] a4 = { 1, 7, 1 };

		System.out.println(equals(a1, a2));
		System.out.println(equals(a2, a3));
		System.out.println(equals(a1,a4));
	}

}
