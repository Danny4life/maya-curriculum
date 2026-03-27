package aiz.collections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueEx {

    public static void main(String[] args) {


        PriorityQueue<String> queue = new PriorityQueue<>();

        queue.add("One");
        queue.add("Two");
        queue.add("Three");
        queue.add("Four");

        Iterator<String> iterator = queue.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
