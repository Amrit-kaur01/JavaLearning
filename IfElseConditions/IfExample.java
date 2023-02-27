package IfElseConditions;
//Java program to get a basic understanding of if statements

//If the condition in the if statement evaluates to true then then if block will be execueted
//If the condition evaluates to false then that block of code will be ignored and execution will start after that

public class IfExample {
	public static void main(String args[]) {
		String name = "Alice";

		/*
		 * syntax of if statement if(boolean expresssion T or F) { //this will execute
		 * when boolean expression evaluates to true }
		 * 
		 */
		if (name.equals("Alice"))
			System.out.println("Hello Alice");

	}
}