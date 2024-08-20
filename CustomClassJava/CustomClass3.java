//Create a Rectangle class with attributes length and width. Implement methods calculateArea() and calculatePerimeter() to compute the area and perimeter of the rectangle. Create an instance of the class, set its dimensions, and print the area and perimeter.

class Rectangle {
    float length;
    float width;

    double calculateArea() {
        return length * width;
    }

    double calculatePerimeter() {
        return 2 * (length + width);
    }
}

public class CustomClass3 {
    public static void main(String[] args) {
        Rectangle obj = new Rectangle();
        obj.length = 3.4F;
        obj.width = 56.7F;
        System.out.println(obj.calculateArea());
        System.out.println(obj.calculatePerimeter());
    }

}
