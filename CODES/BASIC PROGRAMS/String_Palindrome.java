import java.util.Scanner;

public class String_Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String str = sc.next(); // mom, dad
		System.out.println("Entered string : "+ str);
		String rev = "";
		for(int i = str.length()-1; i >= 0; i--) {
			rev += str.charAt(i);
		}
		System.out.println("Reversed string : "+ rev);
		System.out.println(str.equals(rev));
		sc.close();
	}
}
