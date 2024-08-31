

class Employee {
    int id;
    String name;
    String father_name;
    int salary;

    public void printDetails() {
        System.out.println("My id is " + id);
        System.out.println("My name is " + name);

    }

    public void printInfo() {

        System.out.println("My father's name is :"+father_name);
    }
    public int getSalary(){
        System.out.println("John salary is: "+salary);
        return salary;
    }
}
    public class CustomClass1{
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee pushpa=new Employee(); //Instantiating a new Employee object

        //Setting properties or Attributes
        pushpa.id=13;
        pushpa.name="CodeWithPushpa";
//        System.out.println(pushpa.id);
//        System.out.println(pushpa.name);

        pushpa.printDetails();

        Employee john=new Employee();

        //setting attributes for john

        john.father_name="Baliram Mehta";
        john.salary=456600;
        john.printInfo();
        john.getSalary();

    }
}