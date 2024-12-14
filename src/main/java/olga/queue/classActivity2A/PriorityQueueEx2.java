package olga.queue.classActivity2A;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueEx2 {
    public static void main(String[] args) {

        // here we are not using a custom comparator
        // so the priority queue will use the natural ordering on integers
        //Natural Ordering for integers corresponds to ascending order (smallest number first)
        PriorityQueue<Integer> queue = new PriorityQueue<>();


        queue.add(900);
        queue.add(750);
        queue.add(1000);
        queue.add(100);
        queue.add(500);


        // show string example
//        queue.add("one");
//        queue.add("two");
//        queue.add("three");
//        queue.add("four");
//        queue.add("five");

       // System.out.println(queue.poll());



        while (!queue.isEmpty()){
            //  for string example the output will print the
            //  element based on their lexicographical order
            // that is how the words are arranged on sequential order of characters
            // poll method it is used to retrieves and removes the head of the queue
            // but return null if this queue is empty.
            System.out.println(queue.poll());
        }


    }
}
