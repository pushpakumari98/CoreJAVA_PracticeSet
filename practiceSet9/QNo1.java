package practiceSet9;


class cylinder{
    private float radius;
    private float height;
    public float getRadius(){
        return radius;
    }
    public void setRadius(float rad){
        this.radius=rad;
    }
    public void setHeight(float heig){
        this.height=heig;
    }
    public float getHeight(){
        return height;
    }
    public double calculateArea(){
        return 2*3.14*radius*height;
    }
    public double calculateVolume(){
        return 3.14*radius*radius*height;
    }
}
public class QNo1 {
    public static void main(String[] args) {
        cylinder obj=new cylinder();
        obj.setHeight(45);
        obj.setRadius(34);
        System.out.println(obj.calculateArea());
        System.out.println(obj.calculateVolume());
    }
}
