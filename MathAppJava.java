/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mathapp.java;

import java.util.Scanner;

public class MathAppJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String again;

        do {
            // Display Menu
            System.out.println("\n=== Math App Menu ===");
            System.out.println("1. Addition of two numbers");
            System.out.println("2. Subtraction of two numbers");
            System.out.println("3. Multiplication of two numbers");
            System.out.println("4. Division of two numbers");
            System.out.println("5. Factorial of a number");
            System.out.println("6. Power (x^y)");
            System.out.println("7. Sum of numbers 1 to N");
            System.out.println("8. Check if a number is prime");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> { // Addition
                    System.out.print("Enter first number: ");
                    double a = sc.nextDouble();
                    System.out.print("Enter second number: ");
                    double b = sc.nextDouble();
                    System.out.println("Result: " + (a + b));
                }
                case 2 -> { // Subtraction
                    System.out.print("Enter first number: ");
                    double a = sc.nextDouble();
                    System.out.print("Enter second number: ");
                    double b = sc.nextDouble();
                    System.out.println("Result: " + (a - b));
                }
                case 3 -> { // Multiplication
                    System.out.print("Enter first number: ");
                    double a = sc.nextDouble();
                    System.out.print("Enter second number: ");
                    double b = sc.nextDouble();
                    System.out.println("Result: " + (a * b));
                }
                case 4 -> { // Division
                    System.out.print("Enter numerator: ");
                    double a = sc.nextDouble();
                    System.out.print("Enter denominator: ");
                    double b = sc.nextDouble();
                    if (b == 0) {
                        System.out.println("Error: Division by zero is undefined!");
                    } else {
                        System.out.println("Result: " + (a / b));
                    }
                }
                case 5 -> { // Factorial
                    System.out.print("Enter a number: ");
                    int n = sc.nextInt();
                    if (n < 0) {
                        System.out.println("Error: Factorial is not defined for negative numbers.");
                    } else {
                        long fact = 1;
                        for (int i = 1; i <= n; i++) {
                            fact *= i;
                        }
                        System.out.println("Factorial of " + n + " = " + fact);
                    }
                }
                case 6 -> { // Power (x^y)
                    System.out.print("Enter base (x): ");
                    double x = sc.nextDouble();
                    System.out.print("Enter exponent (y): ");
                    int y = sc.nextInt();
                    double result = 1;
                    for (int i = 1; i <= Math.abs(y); i++) {
                        result *= x;
                    }
                    if (y < 0) {
                        result = 1 / result;
                    }
                    System.out.println(x + "^" + y + " = " + result);
                }
                case 7 -> { // Sum 1 to N
                    System.out.print("Enter a positive integer N: ");
                    int n = sc.nextInt();
                    if (n <= 0) {
                        System.out.println("Error: Please enter a positive integer.");
                    } else {
                        int sum = 0;
                        for (int i = 1; i <= n; i++) {
                            sum += i;
                        }
                        System.out.println("Sum of numbers 1 to " + n + " = " + sum);
                    }
                }
                case 8 -> { // Check Prime
                    System.out.print("Enter a number: ");
                    int n = sc.nextInt();
                    if (n <= 1) {
                        System.out.println(n + " is not a prime number.");
                    } else {
                        boolean isPrime = true;
                        for (int i = 2; i <= Math.sqrt(n); i++) {
                            if (n % i == 0) {
                                isPrime = false;
                                break;
                            }
                        }
                        if (isPrime) {
                            System.out.println(n + " is a prime number.");
                        } else {
                            System.out.println(n + " is not a prime number.");
                        }
                    }
                }
                case 0 -> {
                    System.out.println("Thank you for using Math App. Goodbye!");
                    sc.close();
                    return; // exit the program
                }
                default ->
                    System.out.println("Invalid choice! Please try again.");
            }

            // Ask if user wants to continue
            System.out.print("\nDo you want to perform another computation? (yes/no): ");
            again = sc.next();
        } while (again.equalsIgnoreCase("yes"));

        System.out.println("Thank you for using Math App. Goodbye!");
        sc.close();
    }

}
