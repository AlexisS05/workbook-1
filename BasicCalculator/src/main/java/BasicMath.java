import java.util.Scanner;

public class BasicMath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextInt();

        System.out.print("Please select an option: \n");

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
}
