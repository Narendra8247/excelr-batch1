import java.util.Scanner;

class Friend {
    String name;
    String phoneNumber;
    String address;

    public Friend(String name, String phoneNumber, String address) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
        System.out.println();
    }
}

public class Demo024 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of friends: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        Friend[] friends = new Friend[n];

      
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for friend " + (i + 1));

            System.out.print("Enter name: ");
            String name = scanner.nextLine();

            System.out.print("Enter phone number: ");
            String phoneNumber = scanner.nextLine();

            System.out.print("Enter address: ");
            String address = scanner.nextLine();

            friends[i] = new Friend(name, phoneNumber, address);
            System.out.println();
        }

        System.out.println("\nFriend Details:");
        for (int i = 0; i < n; i++) {
            System.out.println("Friend " + (i + 1) + ":");
            friends[i].displayDetails();
        }

        scanner.close();
    }
}
