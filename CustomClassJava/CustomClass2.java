
class Employee1{
    int salary;
    String name;

     public int getSalary(){
        return salary;
    }
    public String getName(){
        System.out.println(name);
         return name;
    }
    public String setName(){
         this.name="Sita";
        System.out.println(name);
         return name;
    }
}
public class CustomClass2 {
    public static void main(String[] args) {
          Employee1 obj=new Employee1();
          obj.salary=90000;
          obj.name="Rahul";
          System.out.println(obj.getSalary());
          obj.getName();
          obj.setName();

    }
}