package com.exam;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class StackProblem {
	public static void main(String[] args) throws IOException {
		var reader = new Scanner(System.in);
		Stack stack = new Stack(reader.nextInt());
		while (reader.hasNext()) {
			String operation = reader.next();

			switch (operation) {
			case "PUSH":
				if (stack.isFull()) {
					System.out.println("Stack overflow");
				} else {
					stack.push(reader.nextInt());
				}
				break;
			case "POP":
				if (stack.isEmpty()) {
					System.out.println("Stack underflow");
				} else {
					System.out.println("Popped " + stack.pop());
				}
				break;
			case "PEEK":
				if (stack.isFull()) {
					System.out.println("Stack empty");
				} else {
					System.out.println("TOP: " + stack.peek());
				}

				break;
			case "ISEMPTY":
				System.out.println(stack.isEmpty() ? "Stack is empty" : "Stack is not empty");
				break;
			case "ISFULL":
				System.out.println(stack.isFull() ? "Stack is full" : "Stack is not full");
				break;
			}

		}

		reader.close();
	}

}
