public class AreaRectangle {

    // static double logic(double l, double b) {
    // double area = l * b;
    // return area;
    // }

    double area(double l, double b) {
        return l * b;
    }

    public static void main(String[] args) {

        // calculate area of rectangle using static and instance methods

        // System.out.println(AreaRectangle.logic(2.0, 1.1));

        AreaRectangle obj = new AreaRectangle();
        System.out.println(obj.area(1.2, 3.4));

    }
}
