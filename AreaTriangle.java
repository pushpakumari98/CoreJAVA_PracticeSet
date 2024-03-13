public class AreaTriangle {
    // method to calculate area of triangle

    static double area(double base, double height) {
        base = 2.3;
        return 0.5 * base * height;
    }

    static void display(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {

        // method call using static keyword

        // AreaTriangle obj = new AreaTriangle();

        System.out.println(AreaTriangle.area(2.1, 5.6));
        // System.out.println(obj.area(2.1, 5.6));

    }
}
