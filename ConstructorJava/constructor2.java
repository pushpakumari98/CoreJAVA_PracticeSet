package ConstructorJava;

class MyEmployee{
    private int id;
    private String name;

    public MyEmployee(String myName,int myId){
        this.id=myId;
        this.name=myName;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
}
public class constructor2 {
    public static void main(String[] args) {
        MyEmployee obj=new MyEmployee("sheela",45);
        System.out.println(obj.getId());
        System.out.println(obj.getName());
    }
}
