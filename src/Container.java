import java.io.*;
import java.util.*;

class Container {

    // Complete the function implementation below
	
	/*   // Brute force
    public int maxArea(int[] height) {
    	int n = height.length;
    	int maxUnits = 0,tmp = 0;   
    	for(int i=0; i<n-1;i++) {
    		for(int j = i+1; j<n; j++) {
    			tmp = (j-i)*Math.min(height[i], height[j]);
    			maxUnits = Math.max(maxUnits, tmp);
    		}
    	}
    	 
        return maxUnits;
    } TC -O(n*n)*/
	// Two pointer aprroach
	public int maxArea(int[] height) {
		int n = height.length;
		int maxArea = 0;
		int leftIndex =1;
		int rightIndex = n-1;
		while(rightIndex> leftIndex) {
			int tmp = (rightIndex-leftIndex)*Math.min(height[leftIndex], height[rightIndex]);
			maxArea = Math.max(maxArea, tmp);
			if(height[leftIndex] < height[rightIndex]) {
				leftIndex++;
			}
			else {
				rightIndex--;
			}
		}
		
		
		return maxArea;
	}
	
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length");
        int n = scanner.nextInt();
        int height[] = new int[n];
        for(int i = 0 ; i < n ; i++) {
        	System.out.println("Enter array" + i);
            height[i] = scanner.nextInt();
        }
        scanner.close();
        int result = new Container().maxArea(height);
        System.out.println(result);
    }
}