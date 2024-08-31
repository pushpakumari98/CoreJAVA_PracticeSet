package ConstructorJava;

class Person{
    private int roll_no;
    private String name;
    private int pin;
    private String state_name;
    private String city_name;
    private String country_name;

    public Person(int roll_no){
        this.roll_no=78;
    }
    public Person(String myName,String cityName,String stateName,String countryName,int pinNo,int roll_no){
        this.name=myName;
        this.city_name=cityName;
        this.country_name=countryName;
        this.state_name=stateName;
        this.pin=pinNo;
        this.roll_no=roll_no;
    }
    public String getName(){
        return name;
    }
    public int getRoll_no(){
        return roll_no;
    }
}
public class ConstructorOverloading {
    public static void main(String[] args) {
        Person obj=new Person("Parul","Jsr","Jh","India",832108,90);
        System.out.println(obj.getName());
        System.out.println(obj.getRoll_no());

    }
}
