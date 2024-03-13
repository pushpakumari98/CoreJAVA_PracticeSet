public class CelciusToFahrenheit {
    double logic(double celcius) {
        double fahrenheit = (9 / 5 * celcius) + 32;
        return fahrenheit;
    }

    public static void main(String[] args) {
        // f=(9/5)*c+32

        CelciusToFahrenheit obj = new CelciusToFahrenheit();
        System.out.println(obj.logic(21.5));

    }
}
