

class Rectangle {
    float length;
    float breadth;


    float calculateArea(){
        return length*breadth;
    }
    float calculatePer(){
        return 2*(length+breadth);
    }
}
public class CustomClass4 {
    public static void main(String[] args) {
     Rectangle obj=new Rectangle();
     obj.length=78;
     obj.breadth=56;
     System.out.println(obj.calculateArea());
     System.out.println(obj.calculatePer());
    }
}
