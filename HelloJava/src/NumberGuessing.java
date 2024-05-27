
import java.lang.Math;
import java.util.Scanner; 

public class NumberGuessing {
	private static int getRandom(){
		final int MIN = 1; 
		final int MAX = 100; 

		return (int)(Math.random() * (MAX - MIN +1)) + MIN; 
	}

	public static Scanner sc = new Scanner(System.in); 

	public static void main(String[] args){
		// Number Guessing mini project 
		final int RANDOM = getRandom(); // [1..100] 
		
		System.out.println("Guess a hidden number in the range 1 to 100");
		System.out.println("Enter -1 if you want to quit the game"); 

		int guessNumber = 200; 
		do{
			guessNumber = sc.nextInt(); 

			if(guessNumber == -1) continue; 

			if(guessNumber > RANDOM){
				System.out.println("Guess smaller number");
			} 
			if(guessNumber < RANDOM){
				System.out.println("Guess higher number");
			}


		}while(guessNumber != RANDOM && guessNumber != -1); 

		if(guessNumber == RANDOM){
			System.out.println("You have successfully guessed the hidden number"); 
			System.out.println("Hidden number = "+ RANDOM);

		}
		else {
			System.out.println("You Quit! Game is over !");
		}

	}
}
