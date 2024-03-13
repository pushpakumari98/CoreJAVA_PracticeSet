 +public class MethodOverloa2 {
    // Method can be overloaded by changing the return type of the different methods
    // Method can be overloaded by changing the no of parameters passed

    public int calculate(int a, int b) {
        return a + b;
    }

    public double calculate(double a, double b) {
        return a + b;
    }

    public long calculate(byte a, byte b) {
        return a + b;
    }

    public static void main(String[] args) {
        MethodOverloa2 obj = new MethodOverloa2();
        System.out.println(obj.calculate(3, 6));
        System.out.println(obj.calculate(3.2, 5.7));
        System.out.println(obj.calculate(3, 6));
    }
}
