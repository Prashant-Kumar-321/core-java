import java.util.Scanner; 

public class Operators {
	public static void main(String[] args){
		// Arithmetic operators 
		int a = 2, b = 5; 
		int add = a+b; 
		// System.out.println(add);

		int sub = a-b; 
		// System.out.println(sub); 

		int multi = a*b; 
		// System.out.println(multi);

		float div = (float)a/b; 
		// System.out.println(div);

		int mod = b%a; 
		// System.out.println(mod);



		// Uninary operator 
		int num = 1; 
		num++; // PreIncrement 
		++num; // Post Increment 
		int num1 = ++num; // 4 
		// System.out.println(num);
		int num2 = num++; // 4 
		// System.out.println(num2);

		int cnt = 9; 
		// System.out.println(--cnt); // 8 
		// System.out.println(cnt--); // 8 
		// System.out.println(cnt);   // 7 
		int negCnt = -cnt; 
		// System.out.println(negCnt);
		// System.out.println(cnt);

		// cnt += 10; // cnt = cnt+10 
		// cnt -= 10; // cnt = cnt-10
		// cnt *= 3;     // cnt = cnt * 3
		// cnt /= 3;  
		// System.out.println(cnt);

		// ....... Math ........... 
		// System.out.println(Math.min(9, 1));
		// System.out.println(Math.max(34, 21));
		// System.out.println(Math.abs(3));
		// System.out.println(Math.pow(0.5, 3));

		// int[] freq  = new int[7]; 
		// int min = 1, max = 6; 
		// for(int i=0; i<160; ++i){
		// 	double random = Math.random(); 
		// 	random *= (max-min+1); 
		// 	int diceNumber = (int)random+min; 
		// 	freq[diceNumber]++; 
		// }


		// for(int diceNo = 1; diceNo<=6; ++diceNo){
		// 	System.out.print(diceNo + " : "); 
		// 	for(int j=0; j<freq[diceNo]; ++j){
		// 		System.out.print("*"); 
		// 	}
		// 	System.out.println(); 
		// }

			

		// ................... INPUT ............................
		// using Scanner class object 
			Scanner sc = new Scanner(System.in); 
			// System.out.println("Enter your age : ");

			// int age  = sc.nextInt(); 
			// if(age >= 18) System.out.println("Your are eligible for voting");
			// else System.out.println("Your are now not Eligible for voting");

			// final float GST = 0.18F; 
			// System.out.println("Enter your salary");
			// float salary = sc.nextFloat(); 
			// float gstTax = salary * GST; 
			// float finalSalary = salary - gstTax; 
			// System.out.println("Your Final Salary = " + finalSalary);

			System.out.print("Enter your name : ");
			// String name = sc.next(); 
			String name = sc.nextLine(); 
			// char ch = str.charAt(0); 
			// System.out.println(ch);

			System.out.println(name);



	}
}
