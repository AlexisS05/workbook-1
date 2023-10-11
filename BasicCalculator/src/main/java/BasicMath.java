import java.util.Scanner;

public class BasicMath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.println("Possible calculations: \n" + "(A)dd\n" + "(S)ubtract\n" + "(M)ultiply\n" + "(D)ivide\n");
        System.out.print("Please select an option: ");
        String choice = scanner.next().toUpperCase();
        int result = 0;

        switch (choice) {
            case "A":
                result = num1 + num2;
                break;
            case "S":
                result = num1 - num2;
                break;
            case "M":
                result = num1 * num2;
                break;
            case "D":
                result = num1 / num2;
                break;
            default:
               break;
        }
        System.out.println("Result: " + result);
    }
}
