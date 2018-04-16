package test2;

public class TestClass {
	public static void main(String[] args) {

		int[] x = new int[28];

		for (int i = 0; i < x.length; i++) {
			x[i] = i * 635;
			
			System.out.println(x[0]);
			System.out.println(x[14]);
			System.out.println(x[27]);
			
		}

	}

}
