package org.Interface;

public class MyStack implements Stack{
    // Define the parameters
    private int[] myArray;
    private int top;
    private int size;

    // Constructor Default
    public MyStack() {
        System.out.println("Please send some parameters for initializing the Stack");
    };

    // Parametrized Constructor
    public MyStack(int size) {
        this.myArray = new int[size];
        this.top = -1;
        this.size = size;
    }

    @Override
    public void push(int num) {
        // Check if size is full
        if(this.top == this.size - 1) {
            System.out.println("Sorry the Stack is full");
            return;
        }
        myArray[++this.top] = num;
        }

    @Override
    public void pop() {
        // Check if array is already empty
        if(this.top == -1) {
            System.out.println("Stack is already empty");
            return;
        }
        this.top--;
    }

    @Override
    public void printStack() {
        // Check if stack is not empty
        if(this.top == 0) {
            System.out.println("There is nothing to print");
            return;
        }
        for(int i = this.top; i >= 0; i--) {
            System.out.println(this.myArray[i]);
        }
    }
}
