import java.util.Scanner;

public class Array7 {
    public static void main(String[] args) {
        int array[] = new int[5];
        System.out.println("Enter the elements of array:");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <= 4; i++) {
            array[i] = sc.nextInt();
        }
        int min = array[0];
        for (int i = 4; i >= 1; i--) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("minimum element:" + min);
    }
}
