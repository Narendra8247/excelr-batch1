import java.util.Scanner;

public class Demo017 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.print("Enter a two-digit number: ");
        int number = sc.nextInt();
        int num1 = number / 10;  
        int num2 = number % 10; 
        int sum = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + sum);

        sc.close();
    }
}
