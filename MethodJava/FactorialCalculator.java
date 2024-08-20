import java.util.Scanner;

public class FactorialCalculator {

    // factorial calculator using methods and getting user input

    // int factorial() {
    // int i, n, f = 1;
    // System.out.println("Enter any number to find factorial:");
    // Scanner sc = new Scanner(System.in);
    // n = sc.nextInt();
    // for (i = 1; i <= n; i++) {
    // f = f * i;
    // }
    // System.out.println(f);
    // return f;
    // }

    // factorial calculator using methods and by assigning value

    int factorial(int n) {
        n = 4;
        n = 9;
        int i, f = 1;
        for (i = 1; i <= n; i++) {
            f = f * i;
        }
        System.out.println("factorial is=" + f);
        return f;
    }

    public static void main(String[] args) {
        FactorialCalculator obj = new FactorialCalculator();
        obj.factorial(7);
        obj.factorial(4);
    }
}
