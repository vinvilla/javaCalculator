package com.example.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a numeric value: ");
        String input1 = scanner.nextLine();
        System.out.print("Enter a numeric value: ");
        String input2 = scanner.nextLine();

        double double1 = Double.parseDouble(input1);
        double double2 = Double.parseDouble(input2);

        System.out.print("Choose and operation (+ - * /): ");
        String input3 = scanner.nextLine();

        double resultAdd = double1 + double2;
        double resultSub = double1 - double2;
        double resultMul = double1 * double2;
        double resultDiv = double1 / double2;

        switch (input3) {
            case "+":
                System.out.println("The answer is " + resultAdd);
                break;
            case "-":
                System.out.println("The answer is " + resultSub);
                break;
            case "*":
                System.out.println("The answer is " + resultMul);
                break;
            case "/":
                System.out.println("The answer is " + resultDiv);
                break;
        }
    }
}