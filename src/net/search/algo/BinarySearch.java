package net.search.algo;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Binary search is best suitable only for sorted arrays
		 * TC - O(log n)
		 * if target > mid element then it must be an right side so increase left by mid+1
		 * divide-and-conquer algorithm.
		 * */
        int target =9;
        int a[]= new int[] {1,2,3,4,5,6,7,8,9};
        int left =0;
        int right = a.length;
        while(left <=right) {
        	int mid= left + (right-left)/2;
        	if(a[mid] == target) {
        		System.out.println("found at "+ mid);
        		break;
        	}
        	else if(a[mid]<target) {// right side
        		left = mid+1;
        	}
        	else {//left side
        		right = mid-1;
        	}
        }
	}

}
