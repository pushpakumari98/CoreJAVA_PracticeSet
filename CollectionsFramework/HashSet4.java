package CollectionsFramework;

import java.util.HashSet;

public class HashSet4 {
    public static void main(String[] args) {
        HashSet<Integer> h1=new HashSet<>(6,0.5F);
        h1.add(4);
        h1.add(8);
        h1.add(4);
        System.out.println(h1);

    }
}
