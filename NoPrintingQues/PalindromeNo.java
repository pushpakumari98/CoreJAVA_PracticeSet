import java.util.Scanner;
public class PalindromeNo {
     public static void main(String[] args) {
        int s=0,r;
        int n=121;
        int   c=n; //c-temporary no n-Original no
        while(n>0){
             r=n%10;
             s=s*10+r;
             n=n/10;

        }
        if(c==s){
            System.out.println("Palindrome no");
        }
        else{
            System.out.println("not a palindrome no");
        }

     }
}
