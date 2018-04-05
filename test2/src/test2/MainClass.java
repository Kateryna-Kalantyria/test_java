package test2;

import java.util.Arrays;

public class MainClass {
	public static void main(String[] args) {
       int[] array = {1,13,5,7,27,6078};
       int first = array[0];
       int last = array [5];
       int second = array [1];
       int fifth = array [4];
       
       array[0] = last;
       array[5] = first;
       array[1] = fifth;
       array[4] = second;
       System.out.println(Arrays.toString(array));
	}

}
