import java.util.Scanner;
public class Factorial {
    public static void main(String args[]){
        //int number = Integer.valueOf(args[0]);
	Scanner in = new Scanner(System.in);

	//finding factorial of a number in Java using Iteration - Example
        System.out.print("Enter any integer value : ");
        int number = in.nextInt();
        int factorial = 1;
        /*
	for(int i = 1; i<=number ; i++){
            factorial = factorial * i;
        }
	*/	        
        while(number > 0){
            factorial = factorial * number;
            number--;
        }
        System.out.println("Factorial of given number " + number + " is " + factorial);
	//===========================================================================
	//finding factorial of a number in Java using recursion - Example
        System.out.println("factorial of 4 using recursion in Java is: " + factorial(4));

	/**
     	* Using tail recursion
     	* 
     	* A function is tail recursive if its last action is to call itself, 
     	* therefore reusing its own call stack.
     	* 
     	* Tail recursive functions usually have a "base-case" which is what stops 
     	* the recursive calls and begins going backwards in the call stack.
     	*/
    }
    public static int factorial(int number){       
        // base-case
        if(number == 0){
            return 1;
        }        
        return number * factorial(number -1); // tail recursion
    }	
}
