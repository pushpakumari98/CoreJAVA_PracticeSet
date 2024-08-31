package Recursion;

public class factorialUsingRecursion {
    public static int iterative(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            int f = 1;
            for (int i = 1; i <= n; i++) {
                f = f * i;

            }
            return f;
        }
    }
   // public static int factorial(int n){

       // using recursive function

//        if(n==1 || n==0){
//            return 1;
//        }
//        else{
//            return n*factorial(n-1);
//        }
//    }
//    public static void main(String[] args) {
//        int n=5;
//        System.out.println("The factorial of "+n+" is:"+factorial(n));


    public static void main(String[] args) {
        int x=5;
        System.out.println("The value of factorial "+x+" is:"+iterative(x));
    }
}
