package CollectionsFramework;

import java.util.*;
import java.util.ArrayDeque;

public class ArrayDeque3 {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1=new ArrayDeque<>();
        ad1.add(6);
        ad1.add(56);
        ad1.add(9);
        ad1.addFirst(5);
        System.out.println(ad1);
        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());
        ad1.clear();
        System.out.println(ad1);

        ArrayDeque<String> deque = new ArrayDeque<>();

        // Add elements to the deque
        deque.add("Banana");
        deque.add("Apple");
        deque.add("Guava");

        // Display the deque
        System.out.println("Deque before clear: " + deque);

        // Clear the deque
        deque.clear();

        // Display the deque after clearing
        System.out.println("Deque after clear: " + deque);
    }
}

