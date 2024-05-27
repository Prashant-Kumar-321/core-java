import java.util.Scanner; 


class Prime {

    public static boolean check(int n){
        if(n<2) return false; 

        for(int i=2; i*i < n; ++i){
            if(n % i == 0) return false; 
        }

        return true; 
    }

}

public class JavaProject {

    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in); 
        
        // Read Integer input 
        // int x = input.nextInt(); 
        // int y = input.nextInt(); 
        // int sum = x+y; 

        // System.out.println("Sum of "+ x + " " + y + " = " +  sum);


        // greet(); 

        // check if number is prime 
        int num; 
        num = input.nextInt(); 

        if(Prime.check(num)){
            System.out.println(num + " is prime");
        }else{
            System.out.println(num + " is not Prime");
        }

        input.close(); 
    }

    public static void greet(){
        Scanner input = new Scanner(System.in); 

        System.out.println("Enter your name");

        String name = input.nextLine(); 

        System.out.println("Hello " + name + " !");
         
        input.close(); 
    }
}
