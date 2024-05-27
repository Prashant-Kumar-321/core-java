import java.util.Scanner; 

public class ConditionalStt {
	
	public static void helloJava() {
		System.out.println("Hello Java") ;
	}

	public static void add(int a, int b){
		int sum = a+b; 
		System.out.println(sum);
	}

	public static void main(String[] args) {
		
		// Conditional Statement

		Scanner sc =  new Scanner(System.in); 
		// System.out.println("Enter available cash : ");
		/*
		int cash = sc.nextInt(); 

		// pen = 10, notebook = 40 
		int penPrice = 10, notebookPrice = 40; 

		if(cash < 10){
			System.out.println("Can get nothing");
			System.out.println("Get more money");
		} 
		else if(cash < penPrice + notebookPrice) { 

			System.out.println("Can get atleast one thing");
			if(cash < 40) 
				System.out.println("You can buy one pen.");
			else {
				System.out.println("You can buy either pen or notebook");
			}
		}
		else {
			System.out.println("Can get both thing");
		}
		*/

		/*
		// 1-monday , 2-tuesday, ..... 7-sunday
		int day = 0; 
		switch(day){ // Only String, int and enum are permited to as a switch value 
			case 1: 
				System.out.println("Monday");
				break; 
			case 2: 
				System.out.println("Tuesday"); 
				break; 
			case 3: 
				System.out.println("Wednessday");	
				break; 
			case 4: 
				System.out.println("Thursday"); 
				break; 
			case 5: 
				System.out.println("Friday");
				break; 
			case 6: 
				System.out.println("Saturday");
				break; 
			case 7: 
				System.out.println("Sunday");
				break; 
			default: 
				System.out.println("Invalid day");
		}
		*/

		// ..... LOOPS ........ 
		// FOR LOOPS | DO WHILE LOOPS  | WHILE LOOPS 
		/*
		for(int i=1; i<=100; ++i){
			System.out.printf("%d ", i);
		}
		System.out.println();

		for(int i=100; i>=1; --i){
			System.out.printf("%d ", i);
		}
		System.out.println();

		int i=100; 
		while( i > 0){
			System.out.print(i+" "); 
			--i; 
		}
		System.out.println();

		int j = 100; 
		do{
			System.out.print(j + " ");

			j--; 
		}while(j > 0); 
		
		*/

		// Excercise : keep taking input untill user says to stop by entering -ve nummber. 

		// int input = -2; 
		// do{

		// 	if(input >= 0) {
		// 		System.out.println(input); 
		// 	}

		// 	System.out.println("Enter a number");
		// 	input = sc.nextInt(); 

		// }while(input >= 0); 


		// ........ BREAK AND CONTINUE .........
		
		/*
		int i=0; 
		while(true){
			if(i%2 == 0) {
				++i;
				continue;  
			}

			System.out.print(i++ + " ");

			if(i > 5) break; 
		}
		*/


		// TRY - CATCH IN EXCEPTION HANDLING 
		// int[] marks  = {97, 23, 100}; 

		// try{

		// 	System.out.println(marks[2]);
		// 	// throw Exception(); 

		// }catch(Exception e){
		// 	System.out.println("Index is out of bound");
		// }

		// System.out.println("Prashant");
		

		// .... Function and Method ..... 
		// helloJava(); 
		// helloJava(); 
		// helloJava(); 

		add(9, 12); 

		sc.close(); 

	}

}
