package OperatorJava;
import java.util.Scanner;

public class ComparisonOperator {
    public static void main(String[] args) {
    // System.out.println("Enter the  number:");
    // Scanner sc=new Scanner(System.in);
    // int a=sc.nextInt();
    // int b=sc.nextInt();
    // int age=23;
    // if(a>b){
    //     if(age>18){
    //         System.out.println("person is eligible to vote");
    //     }
    //     else{
    //         System.out.println("person is not eligible to vote");
    //     }
    // }
    // else{
    //     System.out.println("invalid input");
    // }

    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the first no:");
    System.out.println("Enter second no:");
    System.out.println("Enter third no:");
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    if(a>b && a==b ){
        System.out.println("both conditions is false");
    }
    else if(a<b && b<c){
        System.out.println("both conditions is true");
    }
    else if(a!=b || a>b){
        System.out.println("Either of the conditions is true");
    }
}
}