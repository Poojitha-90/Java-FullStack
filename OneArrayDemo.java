public class OneArrayDemo {
    public static void main(String[] args) {
        // Declare and initialize a one-dimensional array
        int[] oneArray = {5, 10, 15, 20, 25};

        // Display the elements of the array
        System.out.println("Elements in oneArray:");
        for (int i = 0; i < oneArray.length; i++) {
            System.out.println("Index " + i + ": " + oneArray[i]);
        }

        // Example: Find the largest element
        int max = oneArray[0];
        for (int i = 1; i < oneArray.length; i++) {
            if (oneArray[i] > max) {
                max = oneArray[i];
            }
        }
        System.out.println("Maximum value in oneArray: " + max);
    }
}
