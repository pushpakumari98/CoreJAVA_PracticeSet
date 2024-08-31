package practiceSet9;

class Cylinder1{

    private float radius;
    private float height;

    public Cylinder1(){
        this.height=56;
        this.radius=45;
    }
    public float getHeight(){
        return height;
    }
    public float getRadius(){
        return radius;
    }
}
public class QNo2 {
    public static void main(String[] args) {
        Cylinder1 obj=new Cylinder1();
        System.out.println(obj.getHeight());
        System.out.println(obj.getRadius());
    }
}
