import java.util.Scanner;
 public class Demo013 {
    String Cust_Name = "Narendra";
    long Account_no = 2525;
    Double Balance = 20000.00;
    void accept_details(){
        System.out.println("Enter your name: ");
        Scanner sc = new Scanner(System.in);
        Cust_Name = sc.nextLine();
        System.out.println("Enter your Account number: ");
        Account_no = sc.nextLong();
        sc.close();
    }
    void Display_details(){
        System.out.println("Hello " +Cust_Name);
        System.out.println("your balance is: " +Balance);
    }
    public static void main(String[] args){
        Demo013 obj = new Demo013();
        obj.accept_details();
        obj.Display_details();
    } 
}