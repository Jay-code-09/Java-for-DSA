import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int a=0,b=1,c=0;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nth term:");
        n = sc.nextInt();
        for(int i=0;i<=n;i++){
            if(i == 0){
                c = 0;
            }else if(i==1){
                c =1 ;
            }else{
                c = a+b;
                a = b;
                b = c;
            }
        }
        sc.close();
        System.out.println("The "+n+"th term of the Fibonacci series is: "+c);
    }
}
