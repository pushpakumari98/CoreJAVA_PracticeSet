import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        //7-->Prime no;bcz divisible by 1 & 7 itself

        int n,count=0;
        System.out.println("Enter any no:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();

        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("prime no");
        }
        else{
            System.out.println("Not prime no");
        }
    }
}
