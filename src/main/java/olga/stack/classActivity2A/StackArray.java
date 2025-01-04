package olga.stack.classActivity2A;

import java.util.Scanner;

public class StackArray {
    private int top;
    private int maxSize = 10;

    private int[] arr = new int[maxSize];

    public StackArray(int top, int maxSize) {
        this.top = top;
        this.maxSize = maxSize;
    }

    public StackArray() {
        this.top = top - 1;
    }

    public boolean isEmpty(){
        return top < 0;
    }

    public boolean push(Scanner sc){
        if(top == maxSize){
            System.out.println("Stack Overflow!!!");
            return false;
        }else {
            System.out.println("Enter Value");
            int val = sc.nextInt();
            top++;
            arr[top] = val;


            System.out.println("Item pushed into stack");

            return true;
        }
    }

    public boolean pop(){
        if(top == -1){
            System.out.println("Stack underflow");
            return false;
        }else {
            top--;
            System.out.println("Item popped");
            return true;
        }
    }

    public void display(){
        System.out.println("Printing stack elements....");
        for(int i = top; i >= 0; i--){
            System.out.println(arr[i]);
        }
    }

}


