import java.util.Scanner;

public class Number_Reverse {
	
	public static void main(String args[]){			 
	        System.out.println("--- Reverse Number Program ---\n");
	        System.out.print("Enter Number: ");
	        Scanner in = new Scanner(System.in);
	        int num = in.nextInt();
	        // 0 error correction --important
	        System.out.print("Reverse of  "+num+" is: ");

	        System.out.println(revNumber(num));
		in.close();		        
	}
	public static int revNumber(int num) {
		if(num == 0) return 0;
		long revNumber = 0;
	        while(num > 0) {
//		       	int rem = num%10;
	        	revNumber = revNumber*10 + (num%10);
	        	num /= 10;	        	
	        }
	        return (int)revNumber;
	}	 
}
