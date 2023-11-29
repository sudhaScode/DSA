package com.sort.algo;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * TC -O(n2)
		 * where bubble sort swaps the every element of an array, but in this algorithm only needed 
		 * element is swaped using any external variable 
		 * a nested loop iterates through the i+n elements, where minimum keep on increase until a smallest
		 * gets find in an array upto loop end
		 * 
		 * finding min element from array
		 * if/not find i++; j=i+1;
		 * */
		int array [] = new int [] {4,6,2,2,3,7,1,8};
		int n= array.length;
		int minimum = 0;
		for(int i=0;i<n-1;i++) {
			minimum =i;
			for(int j =i+1;j<n;j++) {
				if(array[j]<array[minimum]) {//2
					minimum =j;
					///System.out.println("j "+j);
				}
			}
			//System.out.println(array[minimum] +" "+i +" "+ minimum);
			int tmp = array[i];
			array[i] = array[minimum];
			array[minimum] = tmp;
		}
		for(int i: array) {
			System.out.print(" "+i);
			
		}

	}

}
