import java.lang.reflect.Array;
import java.util.Scanner;

public class RentCarCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome! Please enter the following information for renting a car here.");

        System.out.print("Enter a pickup date: MM,DD: ");
        String pickupDate = scanner.next();

        String[] dateSplit = pickupDate.split(",");
        String formattedDate = dateFormat(dateSplit);


        System.out.print("How many days will you rent for? ");
        int rentDays = scanner.nextInt();
        double totalPrice = rentDays * 30;

        boolean tollTagChoice = false;
        double tollTagPrice = 3.95;
        double tollTagCost = 0;
        String userInput = "";

        while (!tollTagChoice) {
            System.out.print("Do you want an electronic toll tag at $3.95/day? (yes/no) ");
            userInput = scanner.next().toUpperCase();
            switch (userInput) {
                case "YES":
                    tollTagChoice = true;
                    tollTagCost = rentDays * tollTagPrice;
                    break;
                case "NO":
                    tollTagChoice = true;
                    break;
            }
        }

        boolean gpsChoice = false;
        double gpsPrice = 2.95;
        double gpsCost = 0;
        String userInputGPS = "";
        while (!gpsChoice) {
            System.out.print("Do you want to add GPS at $2.95/day? (yes/no) ");
            userInputGPS = scanner.next().toUpperCase();
            switch (userInputGPS) {
                case "YES":
                    gpsChoice = true;
                    gpsCost = rentDays * gpsPrice;
                    break;
                case "NO":
                    gpsChoice = true;
                    break;
            }
        }

        System.out.print("What is your current age? ");
        int age = scanner.nextInt();

        double surcharge = (age < 25) ? totalPrice * .30 : 0.0;
        String surchargeMessage = (age < 25) ? "You are underage. There is a 30% surcharge fee" : "You are over age. There is no surcharge fee.";

        double totalPriceResult = totalPrice + tollTagCost + gpsCost + surcharge;

        System.out.println("Here is your results: \n" + "Pickup date: " + formattedDate + "\nOptional costs: " + userInput + " Electronic Toll Tag, " + userInputGPS + " GPS \n" + ""
                + surchargeMessage + "\nHere is the total cost: $" + totalPriceResult);
    }

    public static String dateFormat(String[] date) {
        return date[0] + "/" + date[1];
    }
}
