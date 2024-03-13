package OperatorJava;
import java.util.Scanner;

public class UnaryOperator {

    public static void main(String[] args) {
        int a=56;
        int b=7;
        //a++;
        System.out.println("++a:"+ ++a);  //++a:57
        System.out.println("a++:"+a++);   //a++:57
        System.out.println("a:"+a);       //a:58
        b=a++ + b++;                      //b:=58+7=65
        System.out.println("b:"+b);       //b:65
        int c= ++a +a++ - ++b;            //c=60+60-66=120-66=54
        System.out.println("c:"+c);       //c:54
        System.out.println("++c:"+ ++c);
        
        System.out.println("Enter the value of d:");
        Scanner sc=new Scanner(System.in);
        int d=sc.nextInt();
        System.out.println(++d);
        
    }
}

