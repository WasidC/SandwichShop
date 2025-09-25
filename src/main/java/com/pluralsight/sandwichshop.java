package com.pluralsight;

import java.util.Scanner;

public class sandwichshop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select the size of your sandwich: ");
        System.out.println("1: Regular $5.45");
        System.out.println("2: Large $8.95");

        int sizeChoice = scanner.nextInt();
        double sandwichPrice = 0.0;

        if (sizeChoice == 1) {
            sandwichPrice = 5.45;
        } else if (sizeChoice == 2) {
            sandwichPrice = 8.95;
        } else  {
            System.out.println("invalid");
        }

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        double discount = 0.0;

        if (age <= 17) {
            discount = 0.10;
        } else if (age >= 65) {
            discount = 0.20;
        }

        double discountAmount = sandwichPrice * discount;
        double totalPrice = sandwichPrice - discountAmount;

        System.out.printf("The price of your sandwich is: $%.2f\n", sandwichPrice);
        if (discount > 0) {
            System.out.printf("Your discount is: $%.2f\n", discountAmount);
        }
        System.out.printf("The price of your sandwich after the discount is: $%.2f\n", totalPrice);

        scanner.close();
    }
}
