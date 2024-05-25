// import different module 
import java.util.Arrays;

public class Array {
	public static void main(String[] args){
		// Array 
		// double[] marks = new double[3];  // char[] -> Nothing float, double
		// boolean[] isPrime = new boolean[10]; // default false 
		
		int[] marks = new int[3];  // by default values are zeor 
		marks[0] = 17; // chemistry 
		marks[1] = 10; // physics 
		marks[2] = 13; // math 

		// sort function 
		Arrays.sort(marks); 

		// System.out.println(marks[0] + " "+ marks[1] + " "+ marks[2]);
		
		// loop over array using traditional loop 
		// for(int i=0; i<marks.length; ++i){
		// 	System.out.println(marks[i]); 
		// }

		// loop over array using foreach loop 
		// for (int ele : marks) {
		// 	System.out.print(ele + ", "); 
		// }		

		// boolean array 
		// for(int i=0; i<isPrime.length; ++i){
		// 	System.out.println(isPrime[i]);
		// }


		int[] prices = {97, 100, 34}; 
		int[][] grid = {
			{2, 3, 8},
			{9, 1, 19}, 
			{3, 9, 13}
		}; 

		// System.out.println(grid[0][0]);
		// System.out.println(grid[1][1]);


		//Note:- By default values of variables [0, null , false] 

		//........ Casting => type conversion ................ 

		// implicit or explicit 
		// implicit ==> small container to big container  
		// explicit ==> big container to small container

		double price = 1000D; 
		double finalPrice = (0.18 * price) + price; 
		int p = (int)finalPrice; // explicit 
		// System.out.println(p);


		//........ Constant ............. 

		final float PI = 3.141528F; 
		// PI = 3.14F; // Error


	}
}
