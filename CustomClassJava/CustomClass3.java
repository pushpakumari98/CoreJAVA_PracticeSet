
class Square{
    double area;
    double per;
    int side;

    public double calculateArea(){
        return side*side;
    }
    public double calculatePer(){
        return 4*side;
    }
}


public class CustomClass3{
    public static void main(String[] args) {
        Square obj=new Square();
        obj.side=25;
        System.out.println(obj.calculatePer());
        System.out.println(obj.calculateArea());

    }
}