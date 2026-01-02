import java.util.Scanner;
void main() {
    Scanner sc = new Scanner(System.in);
    float tempc;
    float tempf;
    System.out.print("Enter temperature in celcius");
    tempc = sc.nextFloat();
    tempf = (tempc * (9f/5f)) + 32;
    System.out.println(tempf);
}