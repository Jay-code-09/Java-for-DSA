
import java.util.Scanner;

public class Fibo_Wi {
    public static void main(String[] args) {
        int a = 0, b=1, c=2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the nth term:");
        int n = sc.nextInt();
        while(c<=n){
            int temp = b;
            b = a+b;
            a = temp;
            c++;
        }
        System.out.println("The "+n+"th term of the Fibonacci series is: "+b);
    }
}
