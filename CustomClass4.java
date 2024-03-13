//Design a Student class with attributes name, id, and an array to store grades. Include a method calculateAverage() that calculates and returns the average grade. Create an instance of the Student class, add some grades, and print the average.

class Student {
    String name;
    int id;

    double calculateAverage(double s1, double s2, double s3, double s4) {
        double total = s1 + s2 + s3 + s4;
        double avg = total / 4;
        return avg;

    }
}

public class CustomClass4 {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.id = 45;
        obj.name = "Pushpa";
        System.out.println(obj.calculateAverage(45.2, 90, 89, 96));
    }
}
