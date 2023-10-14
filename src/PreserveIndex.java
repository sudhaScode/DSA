import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PreserveIndex {

	static int findIndicesSum(int [] array) {
		Map<Integer, Integer> duplicate = new HashMap<Integer, Integer>();
		for (int i=0; i<array.length;i++) {
			duplicate.put(i, array[i]);
		}
		Arrays.sort(array);
		return array[0];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.println("Size of an array");
		int size = scan.nextInt();
		int array[] = new int [size];
		for (int i=0; i<size;i++) {
			System.out.println("element + "+ i);
			array[i] = scan.nextInt();			
		}
		
	}
}
