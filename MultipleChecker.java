import java.util.Scanner;

public class MultipleChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // Check if one number is a multiple of the other
        if (num1 % num2 == 0) {
            System.out.println(num1 + " is a multiple of " + num2);
        } else if (num2 % num1 == 0) {
            System.out.println(num2 + " is a multiple of " + num1);
        } else {
            System.out.println(num1+ "is not  a multiple of" +num2);
        }
    }
}
