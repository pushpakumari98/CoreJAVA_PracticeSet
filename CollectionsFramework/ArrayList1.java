package CollectionsFramework;
import java.util.*;
import java.util.ArrayList;

public class ArrayList1{
    public static void main(String[] args) {
        ArrayList<Integer> l1=new ArrayList<>();
        ArrayList<Integer> l2=new ArrayList<>();
        l2.add(15);
        l2.add(18);
        l2.add(19);

        l1.add(6);
        l1.add(7);
        l1.add(4);
        l1.add(6);
        l1.add(0,5);
        l1.add(0,1);
        l1.addAll(0,l2);
        System.out.println(l1.contains(27));
        System.out.println(l1.indexOf(6));
        System.out.println(l1.lastIndexOf(6));
        l1.set(1,566);
        for(int i=0;i<l1.size();i++ ){
            System.out.print(l1.get(i));
            System.out.print(",");
        }
    }
}
