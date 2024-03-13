//Develop a Car class with attributes make, model, and year. Implement a method isAntique() that returns true if the car is more than 25 years old, and false otherwise. Create an instance of the Car class and check if it's an antique.

class Car {

    String made;
    String model;
    int year;

    public boolean isAntique(int carAge) {
        if (carAge > 25) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        return false;
    }
}

public class CustomClass5 {
    public static void main(String[] args) {
        Car obj = new Car();
        obj.isAntique(89);
        obj.isAntique(20);
    }
}
