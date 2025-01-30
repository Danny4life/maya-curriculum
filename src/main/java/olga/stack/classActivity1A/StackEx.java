package olga.stack.classActivity1A;

import java.util.EmptyStackException;

// implement a stack using linked list
// watch recording again and take note
// also show how to implement stack using array
// represent the animation on the slide
public class StackEx {


    /**
     * private ListNode top;​
     *
     * private int length;​
     *
     * public void push(int data){​
     *
     * ListNode temp = new ListNode(data);​
     *
     * temp.next = top;​
     *
     * top = temp;​
     *
     * length++;​
     *
     * }​
     *
     * The top node is use to insert and remove element from the stack,
     * while the length represent the size of the stack.​
     *
     * Step 1. top will point to null, while the length will be 0;
     * top ---> null. Length = 0;​
     *
     * Step 1. we want to insert an element with data 10 we call the
     * push(10) method and pass the data into it. data = 10;​
     *
     * Step 2.  temp will now point to 10,
     * while it's next will point to null; [10] --> null​
     *
     * Step 3. top will now point to temp, top -> temp;
     * top -> 10 while is next is pointing to null​
     *
     * Step 4. the length of the stack will be incremented by 1, length = 1​
     *
     * [10]---> null
     */

    private ListNode top; // holds the top element
    private int length; // store the length of the stack

    private class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;

        }
    }

    public StackEx(){
        top = null;
        length = 0;
    }

    public int length(){
        return length;
    }

    public boolean isEmpty(){
        return length == 0;
    }

    public void push(int data){
        ListNode temp = new ListNode(data);
        temp.next = top;
        top = temp;
        length++;

    }

    public int pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }

        int result = top.data;
        top = top.next;
        length--;
        return result;
    }

    public int peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }

        return top.data;
    }


    public static void main(String[] args) {

        StackEx stack = new StackEx();

        stack.push(10);
        stack.push(20);
        stack.push(30);


        System.out.println(stack.peek());

        stack.pop();

        System.out.println(stack.peek());

    }
}
