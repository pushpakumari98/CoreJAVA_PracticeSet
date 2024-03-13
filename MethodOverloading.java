public class MethodOverloading {

    public double volume(double length, double breadth, double height) { // volume of cuboid
        double volume1 = length * breadth * height;
        return volume1;
    }

    private double volume(double radius) { // volume of sphere
        double volume2 = (4 / 3) * Math.PI * radius * radius * radius;
        return volume2;
    }

    public float volume(int a) { // volume of cube
        return a * a * a;
    }

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        System.out.println(obj.volume(3.2, 4.2, 3.2));
        System.out.println(obj.volume(4.5));
        System.out.println(obj.volume(5));

    }
}
