package lenox.queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueEx {

    public static void main(String[] args) {

        PriorityQueue<String> queue = new PriorityQueue<>();


        queue.add("one");
        queue.add("two");
        queue.add("three");
        queue.add("four");
        queue.add("five");


        Iterator<String> iterator = queue.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());

        }
    }
}
