//Create a Java class called Person with attributes name and age. Implement a method displayDetails() that prints the name and age of the person. Create an instance of the Person class and call the displayDetails() method.

class Person {
    String name;
    int age;

    public void displayDetails() {
        System.out.println("my name is:" + name);
        System.out.println("my age is:" + age);
    }
}

public class CustomClass1 {
    public static void main(String[] args) {
        Person obj = new Person();
        obj.name = "Pushpa";
        obj.age = 21;
        obj.displayDetails();
    }
}
