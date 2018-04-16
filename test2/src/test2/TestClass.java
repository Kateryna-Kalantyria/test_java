package test2;

public class TestClass {
	public static void main(String[] args) {
		
		for (int i = 10; i <= 20; i++) {
			System.out.println(i);
		}
		System.out.println();
		int i =10;
		while (i <= 20) {
			System.out.println(i++);
		}
		System.out.println();
		i = 10;
		do {
			System.out.println(i++);
		}while (i<=20);
		    System.out.println();
		int[] arr = {10,11,12,13,14,15,16,17,18,19,20};
		for (int x : arr)
			System.out.println(x);
			
			
		
		
	}

}
