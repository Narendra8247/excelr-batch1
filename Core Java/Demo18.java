import java.util.Scanner;
public class Demo18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter minutes: ");
        int minutes = sc.nextInt();
        int years = minutes / 525600;
        System.out.println("Years:" + years);
    }
}