public class Array5 {
    public static void main(String[] args) {
        // write a java program to reverse an array

        int[] arr = { 34, 25, 19, 78, 89, 90 };
        for (int i = 5; i >= 0; i--) {
            System.out.println(arr[i]);
        }
        int sum = arr[0] + arr[1] + arr[2] + arr[3] + arr[4] + arr[5];
        System.out.println("sum of array elements:" + sum);
        int i = 5;
        while (i >= 0) {
            System.out.println(arr[i]);
            i--;
        }
    }
}
