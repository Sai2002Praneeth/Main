import java.util.Scanner;

public class String_Reverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = sc.next();
		System.out.println("Before Reverse : "+ str);
		String rev = "";
		for(int i = str.length()-1; i >= 0; i--) {
			rev += str.charAt(i);
		}
		System.out.println("After Reverse : "+ rev);
		sc.close();
	}
}
