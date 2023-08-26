import java.util.Scanner;

public class Fibonacci {
	public static void main (String [] args) {		
		long f = 0;
		long n = 1;
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the index number you would like to print : "); 
		int number = input.nextInt();			
		for(int i = 0; i <= number; i++) {
			f = f + n;
			n = f - n;
			System.out.print(n+" ");
		}		
	}
}

