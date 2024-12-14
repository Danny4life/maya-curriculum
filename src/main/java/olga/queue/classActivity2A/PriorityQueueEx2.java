package olga.queue.classActivity2A;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueEx2 {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<>();


        // on FIFO basis
        queue.add("one");
        queue.add("two");
        queue.add("three");
        queue.add("four");
        queue.add("five");


        while (!queue.isEmpty()){
            // the output will print the element based on their lexicographical order
            // that is how the words are arranged on sequential order of characters
            // poll method it is used to retrieves and removes the head of the queue
            // but return null if this queue is empty.
            System.out.println(queue.poll());
        }
    }
}
