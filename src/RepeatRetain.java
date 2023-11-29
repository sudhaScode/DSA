import java.util.*;

public class RepeatRetain {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        /*int n = scanner.nextInt();
	        int k = scanner.nextInt();
	        int arr[] = new int[n];
	        for (int i = 0; i < n; i++) {
	            arr[i] = scanner.nextInt();
	        }*/
	        int arr[] = new int [] {1,2,2,3,4,5,5,5,5,6,6,7,7,7,7,7};
	        int k=3;
	        int result = retainingRepetitions(arr, k);
	        
	        for (int i = 0; i < result; i++) {
	            System.out.print(arr[i] + " ");
	        }
	         
	        scanner.close();
	    }
	 
	 
	public static int  retainingRepetitions(int arr[],int k) {
		    //1 2 2 3 4 5 5 5 5 6 6 7 7 7 7 7
		    //k =3
		  /*
		   *return the count of updated length 
		   * */
		int newLength=0;
		int count =0;
		for(int i=1;i<arr.length;i++) {
			if(arr[i-1]==arr[i]) {
				continue;
			}
			else {
				arr[newLength] = arr[i-1];
				newLength++;
			}
		}
		return newLength;		
	}

}
