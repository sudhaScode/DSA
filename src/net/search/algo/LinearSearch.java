package net.search.algo;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * if array is not sorted 
		 * TC - O(n)
		 * 
		 * */
		int target = 0;
		int a[]= new int []{8,9,2,3,4,5,6,1,0,8};
		for(int i=0;i<a.length;i++) {
			if(target == a[i]) {
				System.out.println("target found at index "+ i);
				break;
			}
		}

	}

}
