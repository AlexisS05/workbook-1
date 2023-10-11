package com.pluralsight;

import java.util.Scanner;

public class MathApp {
    public static void main(String[] args) {
        double pricePerPound = 1.5;
        int poundOfPotatoes = 10;
        double totalPrice =  pricePerPound * poundOfPotatoes;
        System.out.printf("%7.2f\n", totalPrice);
        System.out.printf("%8.3f\n", totalPrice);
        double answer = 5. / 3.;
        double answer2 = 3. / 5.;
        System.out.printf("Your value is $  %8.2f %8.3f\n", answer, answer2);
        System.out.println("Hello, my name is 0'Leary'");
        System.out.println("--------------------Exercises-------------------");


        int bobSalary = 50000;
        int garySalary = 70000;
        int highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("The highest salary is: " + highestSalary);

        int carPrice = 20000;
        int truckPrice = 30000;

        int smallestPrice = Math.min(carPrice, truckPrice);
        System.out.println("The smallest price is: " + smallestPrice);

        final double RADIUS = 7.25;
        double area = Math.PI * Math.pow(RADIUS, 2);
        System.out.printf("This is the area: %.2f\n", + area);

        final double NUM = 5.0;
        double squareRoot = Math.sqrt(NUM);
        System.out.printf("This is the square root: %.2f\n", + squareRoot);

        final int X1 = 5;
        final int X2 = 85;
        final int Y1 = 10;
        final int Y2 = 50;
        final int POW = 2;

        final double distance = Math.sqrt(Math.pow(X2 - X1, POW) + Math.pow(Y2 - Y1, POW));
        System.out.printf("This is the distance: %.2f\n", + distance);

        double absNum = -3.8;
        double absOutput = Math.abs(absNum);
        System.out.printf("This is the absolute value: " + absOutput);

        double random = Math.random();
        System.out.printf("\nThis is a random number: " + random);

        double distance2 = calculateDistanceBetween(85,5,50,10);
        System.out.printf("\nThis is the distance: %.2f\n", + distance2);

        int num = 42;
        double pi = 3.14159;
        String name = "Alice";
        char grade = 'A';
        boolean isEnrolled = true;

        String formatted = String.format("Number: %d, Pi: %f, Name: %s, Grade: %c, Is Enrolled %b", num, pi, name, grade, isEnrolled);
        System.out.println(formatted);

        Scanner scanner = new Scanner(System.in);

        double inputValue = printPromptScreen("Please enter a floating-point number");
        System.out.println(inputValue);

        System.out.println("Please enter your name: ");
        String inputString = scanner.nextLine();
        System.out.println(inputString);

        if(inputString.equals("Paul")){
            System.out.println("Go away, Paul");
        } else {
            System.out.println("Hello " + inputString);
        }

    }

    public static double calculateDistanceBetween(double x2, double x1, double y2, double y1) {
       return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static double printPromptScreen(String prompt) {
        double value;
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt + " : ");
        value = scanner.nextDouble();
        scanner.nextLine();
        return value;
    }
}
