package GetterAndSetter;

class Circle{
    private float radius;

    public void setRadius(float radius){
        this.radius=radius;
    }
    public double getRadius(){
         return radius;
    }
    public double calculateArea(){
        return 3.14*radius*radius;
    }
    public double calculatePer(){
        return 2*3.14*radius;
    }

}
public class GetterSetterForCircle {
    public static void main(String[] args) {
        Circle obj=new Circle();
        obj.setRadius(56);
        System.out.println(obj.calculateArea());
        System.out.println(obj.calculatePer()
        );
    }
}
