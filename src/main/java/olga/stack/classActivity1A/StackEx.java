package olga.stack.classActivity1A;

import java.util.EmptyStackException;

// implement a stack using linked list
// watch recording again and take note
// also show how to implement stack using array
// represent the animation on the slide
public class StackEx {

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
