class Circle{
    double radius;

    double calculateArea(){
        return 3.14*radius*radius;
    }
    double calculatePer(){
        return 4*3.14*radius;
    }
}

public class CustomClass6{
    public static void main(String[] args) {
        Circle obj=new Circle();
        obj.radius=78;
        System.out.println(obj.calculatePer());
        System.out.println(obj.calculateArea());
    }
}