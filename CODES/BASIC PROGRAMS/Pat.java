import java.io.*;

public class Pat {
    static void Pattern(int n) {
        int i, j, a = 0;
        System.out.println("Enter no.of rows:");
        for (i = n - 1; i >= 0; i--) {
            for (j = n - 1; j > a; j--) {
                System.out.print(" ");
            }
            System.out.print((char) (i + 65));
            for (j = 1; j <= (a * 2); j++) {
                System.out.print(" ");
            }
            if (i < n - 1) {
                System.out.print((char) (i + 65));
            }
            System.out.print("\n");
            a++;
        }
    }

    public static void main(String[] args) {
        int n = 6;
        Pattern(n);
    }
}
