package com.pluralsight;

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
        final int Y1 = 15;
        final int Y2 = 50;

        final double distance = Math.sqrt(Math.pow(X2 - X1, 2) + Math.pow(Y2 - Y1, 2));
        System.out.printf("This is the distance: %.2f\n", + distance);

        double absNum = -3.8;
        double absOutput = Math.abs(absNum);
        System.out.printf("This is the absolute value: " + absOutput);

        double random = Math.random();
        System.out.printf("\nThis is a random number: " + random);
    }
}
