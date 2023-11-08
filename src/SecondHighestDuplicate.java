import java.util.Arrays;
import java.util.Comparator;

public class SecondHighestDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // an array numberofnumbers ->
		// second highest number
	   int array [] = new int[] {2,9,13,5,5,7,10,12,11};
	   // Math.max(start,end) 0
	   // 0 < start
	   //tmp = 
	   
	   /*int start =0;
	   int end = array.length-1;
	   int tmp= array[start];
	   while(start<=end) {
		   tmp = Math.max(tmp, array[end]);
		   if(tmp< array[start+1]) {
			   tmp = array[start++];
		   }
		   end--;
	   }*/
	   /*
	    * two find the second largest find the largest
	    * in loop the second comes before the largest
	    * return it
	    * how? logic is
	    * assign to first element as highest
	    * if high is less than array next element
	    * assign high to current element
	    * and second to high;
	    * 
	    * */
	   
		int highest = array[0];
		int secondHighest = Integer.MIN_VALUE;
          for(int i=1;i<array.length;i++) {//{2,9,13,5,5,7,10,12,11};
        	  //secondHighest = highest;
        	  if(highest< array[i]) {
        		  secondHighest = highest; // 2 9
        		  highest = array[i]; //9 13 
        		  
        		 // System.out.println(highest);
        	  } 
        	  else if(secondHighest < array[i] && array[i] != highest ) {
        		  secondHighest = array[i];
        	  }
          }
		System.out.println(secondHighest);
	}

}
