import java.util.Scanner;

public class MaxFinder {

    // Iterative method to find max
    public static int findMaxIterative(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // Recursive method to find maximum
    public static int findMaxRecursive(int[] arr, int index) {
        if (index == arr.length - 1) {
            return arr[index];
        }

        int maxInRest = findMaxRecursive(arr, index + 1);
        return arr[index] > maxInRest ? arr[index] : maxInRest;
    }

    // Main method to run program
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter number of elements: ");
        int n = scn.nextInt();
        int[] numbers = new int[n];

        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scn.nextInt();
        }

        // Find maximum
        int maxIterative = findMaxIterative(numbers);
        int maxRecursive = findMaxRecursive(numbers, 0);

        // Output
        System.out.println("Maximum (Iterative): " + maxIterative);
        System.out.println("Maximum (Recursive): " + maxRecursive);
    }
}
