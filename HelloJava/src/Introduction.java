
public class Introduction {
	
	public static void main(String[] args){

		// our first program 
		// System.out.println("Hello World"); 
		// System.out.print("Hello World!"); System.out.println();
		// System.out.print("Hello, Java!");

		// Variable is memory location where we can store our program's data
		// .................. Types ........................................ 

		// 1. Primitive Data types 
		// byte - 1 [-128 to 127]
		// short -2 
		// int - 4
		// long - 8 
		// float 4 [3.14, 8.907]
		// double - 8
		// char - 2
		// boolean - 1 [0/1 false/truue]
		
		byte age = 30; 
		short budget = (short)3676754; 
		int phone = 2000000009;  // 2 * 10^9
		long moonDistance = 2786567576485690276L; 
		float PI = 3.14F; 
		char operator = '+'; 
		boolean isLogedIn = true; // false; 


		//..............  Non-Primitive Types / Reference Type .................... 

		// ................... String .............................................
		// Strings are immutable that we can not modify string once we create 
		String name = "Raj"; 
		String friend = new String("Shyam"); 
		// System.out.println(name.length());

		// **Concatinate 	
		String firstname = new String("Prashant"); 
		String lastname  = new String("Kumar"); 
		String fullName = firstname + ' ' + lastname + ' '+ "Gupta"; 
		// System.out.println(fullName);

		// **charAt 
		String pet = "Cat"; 
		// C  a  t 
		// 0  1  2 
		// Iteration over string 
		// Traditional for loop 
		// for (int i = 0; i < pet.length(); i++) {
		// 	System.out.print(pet.charAt(i) + " ");
		// } 

		// covert string into char Array ==> str.toCharArray()

		// for (char ch: pet.toCharArray()) {
		// 	System.out.print(ch + " "); 
		// }
		// System.out.println();
		
		// **Replace ==> modifying char 
		
		String city = "DDelhDi"; 
		String city2 = city.replace('D', 'd'); // Return new modified string 
		// it replaces all instances of old char with new char 
		// System.out.println(city);
		// System.out.println(city2);

		String str = "abbccdabefhabaaab"; 
		String newStr = str.replace("ab", "ABC"); // change all instacne of 'ab' with 'ABC'  
		// System.out.println(newStr);

		// **replace a character in the string 
		str = "ABC"; 
		StringBuilder sb = new StringBuilder(str); // string builder are mutable 
		sb.setCharAt(1, 'D'); 

		String modifiedStr = sb.toString(); 
		// System.out.println(modifiedStr);

		// **substring 
		str = "PAryan and Raj"; 
		// P A   r  y  a  n ' ' a  n  d  ' '  R  a  j
		// 0 1  2   3  4  5  6  7  8  9  10  11  12 13 
		String subStr = str.substring(1, 6); // substring starting from st and of len lenght ; syntax is [substring(st, st+len)]
		// System.out.println(subStr);
		// System.out.println(str.substring(7));

	}
	

}
