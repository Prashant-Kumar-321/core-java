import java.util.Scanner; 

class Add{
	private double x; 
	private double y; 

	Add (double x, double y){
		this.x = x; 
		this.y = y; 
	}
	Add(){
		x = 0;
		y = 0; 
	}

 	double compute(){
		return this.x + this.y;  
	}
}

public class AddTwoNumber {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in); 

		System.out.print("Enter two number : ");
		double num1, num2; 
		num1 = sc.nextDouble(); 
		num2 = sc.nextDouble(); 

		Add operation = new Add(num1, num2);
		System.out.println("Sum : "); 
		System.out.println(operation.compute()); 
	}
}
