package GetterAndSetter;

class MyEmployee{
      private int id;
      private String name;

      public String getName(){
          return name;
      }
      public void setName(String n){
          this.name=n;
      }
      public int getId(){
          return id;
      }
      public void setId(int i){
          this.id=i;
      }
}
public class getterSetter {
    public static void main(String[] args) {
        MyEmployee obj=new MyEmployee();
        obj.setId(56);
        obj.setName("ritu");
        System.out.println(obj.getId());
        System.out.println(obj.getName());
    }
}
