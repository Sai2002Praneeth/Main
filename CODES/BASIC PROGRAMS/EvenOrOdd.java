public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any integer value : ");
        int num = in.nextInt();
        if (num%2 == 0) {
            System.out.println(num + " is even.");
        }
        else System.out.println(num + " is odd.");
        in.close();
    }
}
