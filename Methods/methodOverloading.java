package Methods;

public class methodOverloading {
    static int calculate(int a,int b){
        int sum=a+b;
        System.out.println(sum);
        return sum;
    }
    static void calculate(){
        System.out.println("good morning");
    }
    static int calculate(int a,int b,int c){
        int sub=a+b-c;
        System.out.println(sub);
        return sub;
    }
    static int calculate(int a,int b,int c,int d){
        int div=a+b/c+d;
        System.out.println(div);
        return div;
    }

    public static void main(String[] args) {
        calculate(1,5,8,9);
        calculate();
        calculate(4,5,9);

    }
}
