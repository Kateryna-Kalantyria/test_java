package test2;

import java.util.Arrays;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[10];
		array [0] = sc.nextInt();
		array [1] = sc.nextInt();
		array [2] = sc.nextInt();
		array [3] = sc.nextInt();
		array [4] = sc.nextInt();
		array [5] = sc.nextInt();
		array [6] = sc.nextInt();
		array [7] = sc.nextInt();
		array [8] = sc.nextInt();
		array [9] = sc.nextInt();
		
		int[]sub1 = new int [5];
		int[]sub2 = new int [5];
		
		sub1[0]= array [0];
		sub1[1]= array [1];
		sub1[2]= array [2];
		sub1[3]= array [3];
		sub1[4]= array [4];
		
		sub2[0]= array [5];
		sub2[1]= array [6];
		sub2[2]= array [7];
		sub2[3]= array [8];
		sub2[4]= array [9];
		Arrays.sort(sub1);
		Arrays.sort(sub2);
		System.out.println(Arrays.toString(sub1));
		System.out.println(Arrays.toString(sub2));
		
		
		
		
		
		
		
		
      // int[] array = {1,13,5,7,27,6078};
      // int first = array[0];
      // int last = array [5];
      // int second = array [1];
      // int fifth = array [4];
      // 
      // array[0] = last;
      // array[5] = first;
      //array[1] = fifth;
      //array[4] = second;
      //System.out.println(Arrays.toString(array));
	}
}
