import java.util.Scanner;

public class Demo043 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an uppercase character: ");
        char uppercaseChar = scanner.next().charAt(0);

        if (Character.isUpperCase(uppercaseChar)) {
            
            char lowercaseChar = Character.toLowerCase(uppercaseChar);
            System.out.println("The lowercase of " + uppercaseChar + " is " + lowercaseChar + ".");
        } else {
            System.out.println("The entered character is not an uppercase letter.");
        }

        scanner.close();
    }
}
