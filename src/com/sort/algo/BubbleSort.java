package com.sort.algo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class BubbleSort {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
       Scanner scan = new Scanner(System.in);
       BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
       //System.out.println("enter a array size");
       /*
        * String size = input.readLine();
        * int num = Interger.parseInt(size);
        * 
       int size = scan.nextInt();
	   System.out.println(size);*/
       int array [] = new int[]{1,3,5,6,2,4};
       /*for(int i=0;i<size;i++) {
    	   System.out.println("enter "+i+" th element");
    	   array[i] = scan.nextInt();
       }*/
      bubbleSort(array);
      for(int i : array) {
    	  System.out.print(" "+ i);
      }
	}
	
	public static void bubbleSort(int array[]) { //
		/*
		 *  bubble sort achieves the time complexity O(n2)
		 *  because it iterates through the nested loops
		 *  the parent loop ends at <n-1
		 *  and the nested loop end at <n-i-1
		 * Swapping takes every place at where j>j+1
		 * where selection sort swap takes place at min element of an array
		 * */
		int n = array.length;
		int i=0;
		while(i<n) {
			for(int j=0;j<n-i-1;j++) {
				if(array[j+1] < array[j]) {
				     int tmp = array[j];
				     array[j] = array[j+1];
				     array[j+1] = tmp;
				}
			}
			i++;
		}	
	}

}
