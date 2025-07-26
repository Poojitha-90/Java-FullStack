import java.util.Scanner;

public class ArrayExample {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int[][] a = new int[2][3];

        System.out.println("Enter the elements for a 2x3 matrix:");
        for (int r = 0; r < 2; r++) {
            for (int c = 0; c < 3; c++) {
                System.out.print("Enter element at a[" + r + "][" + c + "]: ");
                a[r][c] = scanner.nextInt();
            }
        }

        System.out.println("\nMatrix you entered:");
        for (int r = 0; r < 2; r++) {
            for (int c = 0; c < 3; c++) {
                System.out.print(a[r][c] + " ");
            }
            System.out.println(); // Move to the next row
        }

        scanner.close();
    }
}
