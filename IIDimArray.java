import java.util.Scanner;

public class IIDimArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] array = new int[4][3];  // 4 rows, 3 columns

        System.out.println("Enter elements for a 4x3 matrix:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter element at [" + i + "][" + j + "]: ");
                array[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nThe matrix you entered is:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();  // Move to next row
        }

        scanner.close();
    }
}
