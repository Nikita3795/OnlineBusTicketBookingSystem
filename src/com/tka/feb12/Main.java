package com.tka.feb12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Online Bus Ticket Booking System");
        System.out.println("1. Register\n2. Login\n3. Exit");
        int choice = scanner.nextInt();
        scanner.nextLine(); 

        switch (choice) {
            case 1:
                UserAuth.registerUser(scanner);
                break;
            case 2:
                if (UserAuth.loginUser(scanner)) {
                    System.out.println("Proceed to booking options...");
                }
                break;
            case 3:
                System.out.println("Exiting...");
                return;
            default:
                System.out.println("Invalid choice");
        }
        scanner.close();
    }
}
