package com.exam;

public class Stack {
	int[] stack;
	int top = -1;
	
	public Stack(int size) {
		this.stack = new int[size];
	}
	
	public void push(int value){
		this.top++;
		this.stack[this.top] = value;
		System.out.println("Pushed "+value);
	}
	
	public int pop() {
		
		int result = this.stack[this.top];
		this.stack[this.top] = 0;
		this.top--;
		return result;
	}
	
	public int peek() {
		return this.stack[this.top];
	}
	
	public boolean isEmpty() {
		return this.top == -1;
	}
	
	public boolean isFull() {
		return this.stack.length == this.top;
	}

}
