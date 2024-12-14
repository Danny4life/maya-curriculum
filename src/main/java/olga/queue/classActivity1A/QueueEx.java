package olga.queue.classActivity1A;

import java.util.NoSuchElementException;
import java.util.Queue;

public class QueueEx {
    private ListNode front; // this list node front will point to the first element on the queue

    private ListNode rear; // this list node rear will point to the last element on the queue

    private int length;


    // add this constructor for 1B activity only
    public QueueEx(){
        this.front = null;
        this.rear = null;
        this.length = 0;
    }


    private class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }


    // this method will be use to return the length of the queue
    public int length(){
        return length;
    }

    public boolean isEmpty(){
        return length == 0;
    }


    // 1A enqueue is the operation will use to add element into the rear of the queue
    public void enqueue(int data){
        ListNode temp = new ListNode(data);

        if(isEmpty()){
            front = temp;
        }else {
            rear.next = temp;
        }

        rear = temp;

        length++;
    }

    // to print the element in a queue
    public void print(){
        // first check if the queue is empty
        if(isEmpty()){
            return;
        }

        // if the queue is not empty then we print the element starting from the front
        ListNode current = front;

        while(current != null){
            System.out.print(current.data + " ---> ");

            current = current.next;
        }
        System.out.println("null");
    }


    // 1B deque operation to remove element from the front
    public int deque(){
        if(isEmpty()){
            throw new NoSuchElementException("Queue is empty");
        }

        // result here will point to 20, cause is the first element that was added
        // and we also need to remove the element from the front end
        int result = front.data;
        // after removing 20, front.next which is 30 will now be moved to front as the next element to be removed
        front = front.next;

        // then we check if front is null, if it is not we go ahead to decrease the length
        // and remove the element, but if it is equal, we know we have to make rear null as well
        // so we can break the link totally
        if(front == null){
            rear = null;
        }

        length--;
        return result;
    }

    // class activity 1C
    public int first(){
        if(isEmpty()){
            throw new NoSuchElementException("Queue is empty");
        }
        return front.data;
    }

    public int last(){
        if(isEmpty()){
            throw new NoSuchElementException("Queue is empty");
        }
        return rear.data;
    }


    public static void main(String[] args) {
        QueueEx queue = new QueueEx();

        // inserting element into the queue
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        queue.print();

        // Do this for 1B.. remove this before running first and last
//        System.out.println("After calling the deque operation");
//        queue.deque();
//        queue.deque();
//        queue.deque();
//        // call this to show the exception
//        queue.deque();

   //     queue.print();
       // System.out.println(queue.first());
     //   System.out.println(queue.last());



    }

}
