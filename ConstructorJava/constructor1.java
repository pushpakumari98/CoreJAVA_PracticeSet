package ConstructorJava;

class MyMainEmployee{
    private int id;
    private String name;
    public MyMainEmployee(){
        id=34;
        name="parul";
    }
    public String getName(){
        return name;
    }
    public int getId(){
       return id;
    }
}
public class constructor1 {
    public static void main(String[] args) {
        MyMainEmployee obj=new MyMainEmployee();
        System.out.println(obj.getName());
        System.out.println(obj.getId());

    }
}
