import java.util.Scanner;

public class BasicMath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1 = getDoubleInput("Enter the first number: ");
        double num2 = getDoubleInput("Enter the second number: ");

        double result = 0;
        boolean done = false;
        while (!done) {
            System.out.println("Possible calculations: \n" + "(A)dd\n" + "(S)ubtract\n" + "(M)ultiply\n" + "(D)ivide\n");
            char choice = scanner.next().charAt(0);
            char choiceUpper = Character.toUpperCase(choice);
            switch (choiceUpper) {
                case 'A':
                    result = num1 + num2;
                    done = true;
                    break;
                case 'S':
                    result = num1 - num2;
                    done = true;
                    break;
                case 'M':
                    result = num1 * num2;
                    done = true;
                    break;
                case 'D':
                    result = num1 / num2;
                    done = true;
                    break;
                default:
                    System.out.println("Please enter a valid choice.");
                    break;
            }
        }
        System.out.println("Result: " + result);
    }
    static double getDoubleInput(String msg) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(msg);
        double input = scanner.nextDouble();
        scanner.nextLine();
        return input;
    }

    static char getCharInput(String msg) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(msg);
        String input = scanner.nextLine();
        return input.charAt(0);
    }
}
