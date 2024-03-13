import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.println("Enter the no of term:");
        Scanner sc=new Scanner(System.in);
        int term=sc.nextInt();
        int a=0,b=1,c;
        for(int i=0;i<=term;i++){
            System.out.println(a);
             c=a+b;
             a=b;
             b=c;
        }
    }
}
