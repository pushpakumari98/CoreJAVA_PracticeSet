
// write a java program to find the maximum element in an array

public class Array6 {
    public static void main(String[] args) {
        // Sample array
        int[] array = { 12, 5, 27, 8, 16, 4, 10 };

        // Initialize max with the first element of the array
        int max = array[0];

        // Iterate through the array to find the maximum element
        for (int i = 1; i < array.length; i++) {// i<=6
            if (array[i] > max) {
                max = array[i];
            }
        }
        // Print the maximum element
        System.out.println("Maximum element in the array: " + max);
    }
}
