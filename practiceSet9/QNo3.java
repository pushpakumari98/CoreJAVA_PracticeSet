package practiceSet9;

class Rectangle{
    private float length;
    private float breadth;

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getBreadth() {
        return breadth;
    }

    public void setBreadth(float breadth) {
        this.breadth = breadth;
    }
}
public class QNo3 {
    public static void main(String[] args) {
        Rectangle obj=new Rectangle();
        obj.setLength(56);
        obj.setBreadth(58);
        System.out.println(obj.getBreadth());
        System.out.println(obj.getLength());
    }
}
