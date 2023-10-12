import java.lang.reflect.Array;
import java.util.Scanner;

public class RentCarCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome! Please enter the following information for renting a car here.");

        String pickupDate = getStringInput(scanner, "Enter a pickup date: MM,DD: ");
        String[] dateSplit = pickupDate.split(",");
        String formattedDate = dateFormat(dateSplit);

        int rentDays = getIntInput(scanner, "How many days will you rent for? ");
        double totalPrice = rentDays * 30;

        boolean tollTagChoice = getBoolean(scanner, "Do you want an electronic toll tag at $3.95/day? (true=yes/false=no) ");
        boolean userInputGPS = getBoolean(scanner, "Do you want to add GPS at $2.95/day? (true=yes/false=no) ");
        boolean roadAssistance = getBoolean(scanner, "Do you want roadside assistance at $3.95/day? (true=yes/false=no)");
        int age = getIntInput(scanner, "What is your current age? ");

        double surcharge = (age < 25) ? totalPrice * .30 : 0.0;
        String surchargeMsg = (age < 25) ? "You are underage. There is a 30% surcharge fee" : "You are over age. There is no surcharge fee.";

        double totalPriceResult =  calculateInputs(tollTagChoice, userInputGPS, roadAssistance, rentDays) + surcharge + totalPrice;

        result(formattedDate, tollTagChoice, userInputGPS, roadAssistance, surchargeMsg, totalPriceResult);
    }

    public static String dateFormat(String[] date) {
        return date[0] + "/" + date[1];
    }
    static String getStringInput(Scanner scanner, String msg){
        System.out.print(msg);
        String input = scanner.next();
        return input;
    }

    static int getIntInput(Scanner scanner, String msg){
        System.out.print(msg);
        int input = scanner.nextInt();
        return input;
    }

    static boolean getBoolean(Scanner scanner, String msg){
        System.out.print(msg);
        boolean input = scanner.nextBoolean();
        return input;
    }

    static double calculateInputs(boolean tollTagChoice, boolean userInputGPS, boolean hasRoadAssistance, int rentDays){
        double tollTagCost = tollTagChoice ? rentDays * 3.95 : 0;
        double gpsCost =  userInputGPS ? rentDays * 2.95 : 0;
        double hasRoadAssistanceCost = hasRoadAssistance ? rentDays * 3.95 : 0;
        return tollTagCost + gpsCost + hasRoadAssistanceCost;
    }

    static void result(String formattedDate, boolean tollTagChoice, boolean userInputGPS, boolean roadAssistance, String surchargeMsg, double totalPriceResult){
        System.out.println("Here is your results: \n" + "Pickup date: " + formattedDate + "\nOptional costs: " + tollTagChoice + " Electronic Toll Tag, " + userInputGPS + " GPS, " + roadAssistance + " Road Assistance\n"
                + surchargeMsg + "\nHere is the total cost: $" + totalPriceResult);
    }
}
