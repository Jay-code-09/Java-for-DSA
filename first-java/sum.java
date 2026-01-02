import java.util.Scanner;

public class sum {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int n = sc.nextInt();
        System.out.print("Enter number 2: ");
        int m = sc.nextInt();
        int sum = n+m;
        System.out.print("Sum is: "+sum);
    }
}