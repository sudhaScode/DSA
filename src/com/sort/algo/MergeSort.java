package com.sort.algo;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// best suits and efficient for larger arrays
		int[] arr = {12, 11, 13, 5, 6};
		mergeSort(arr, 0, arr.length-1);
		for(int i : arr) {
			System.out.print(i+" ");
		}

	}
	
	public static void mergeSort(int [] arr, int left, int right) {//n
		if(left<right) {
			int mid = left +(right-left)/2;
			// further recursively dividing the array
			mergeSort(arr, left, mid);
			mergeSort(arr, mid+1, right);
			
			merge(arr, left, mid, right);
		}	
	}
	
	public static void merge(int arr[], int left, int middle, int right) {
		   int sizeLeft = middle-left+1;
		   int sizeRight =right-middle;
		   
		   int tempLeft[] = new int [sizeLeft];
		   int tempRight[] = new int [sizeRight];
		   
		   for(int i=0;i<sizeLeft;++i) {//log n
			   tempLeft[i] = arr[left +i];
			   
		   }
		   for(int j=0;j<sizeRight;++j) {//log n
			   tempRight[j] = arr[middle+1 +j];
			   
		   }
		   
		   int i=0,j=0;
		   int k=left;// initial index of arr
		   while(i<sizeLeft && j<sizeRight) {//log n
			   if(tempLeft[i]<=tempRight[j]) {
				   arr[k]=tempLeft[i];
				   i++;
			   }
			   else {
				   arr[k]=tempRight[j];
				   j++;
			   }
			   k++;
		   }
		   // copy the remaining elements from the array
		   while(i<sizeLeft) {
			   arr[k]=tempLeft[i];
			   i++;
			   k++;
		   }
		   while(j<sizeRight) {
			   arr[k]=tempRight[j];
			   j++;
			   k++;
		   }
	}

}
