import java.util.Scanner;

public class MyClass {
	public static void main (String[] args) {
       Scanner scanner = new Scanner (System.in);
       String S1 = scanner.nextLine();
       String S2 = scanner.nextLine();
       String S3 = scanner.nextLine(); 
       
       System.out.println(S1+S3);
       System.out.println(S3+S2+S1);
       System.out.println(S1+S2+S3);
	}
}