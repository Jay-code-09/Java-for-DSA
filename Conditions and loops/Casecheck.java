import java.util.Scanner;

public class Casecheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string:");
        char ch = sc.next().trim().charAt(0);
        if(ch >= 'a' && ch <= 'z'){
            System.out.println("Lower Case");
        }else if(ch >= 'A'&& ch<= 'Z'){
            System.out.println("Upper Case");
        }else{
            System.out.println("Athoer character");
        }
        sc.close();
    }
}
