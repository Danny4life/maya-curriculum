package olga.stack.classActivity2A;

import java.util.Scanner;

public class StackArray {

//    Represents the index of the topmost element in the stack.
//    Initially, it will be set to an invalid index, indicating an empty stack.
    private int top;

//    Sets the default maximum size of the stack to 10.
//    This value can be overridden by a parameterized constructor.
    private int maxSize = 10;

//    Creates an array of integers to store the stack elements.
//    The size of the array is determined by maxSize.
    private int[] arr = new int[maxSize];

    public StackArray(int top, int maxSize) {
        this.top = top;
        this.maxSize = maxSize;
    }

    public StackArray() {
        this.top = top - 1;
    }

//    Purpose: Checks if the stack is empty.
//    How it works:
//    Returns true if top is less than 0 (indicating no elements in the stack).
//    Returns false otherwise.

    public boolean isEmpty(){
        return top < 0;
    }
//
//    Purpose: Adds an element to the top of the stack.
//    How it works:
//    Check for Overflow:
//    If top == maxSize, the stack is full, and no new element can be added. It prints an error message and returns false.
//    Push Element:
//    Prompts the user to enter a value using a Scanner.
//    Increments top to point to the next available position in the stack.
//    Assigns the entered value to the array at the new top index.
//    Prints a success message and returns true.

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


//    Purpose: Removes the top element from the stack.
//    How it works:
//    Check for Underflow:
//    If top == -1, the stack is empty, and no elements can be removed. It prints an error message and returns false.
//    Pop Element:
//    Decrements top to "remove" the topmost element.
//    Prints a success message and returns true.

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

//    Purpose: Displays all elements in the stack from top to bottom.
//    How it works:
//    Iterates through the array starting from the top index down to 0.
//    Prints each element in the stack.
    public void display(){
        System.out.println("Printing stack elements....");
        for(int i = top; i >= 0; i--){
            System.out.println(arr[i]);
        }
    }

}


