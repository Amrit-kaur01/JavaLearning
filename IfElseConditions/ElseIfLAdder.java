package IfElseConditions;
/*
 * Program to learn basics of if-else-if ladder with examples
 * For the example I will take a variable named wpm
 * Comparing it with values in if-else-if condition, the program will print whether you are a pro or a beginner in typing,etc.
 */

public class ElseIfLAdder {
	public static void main(String args[]) {
		int wpm = 32; // variable to store the value of words per minute

		// Based on the value of wpm it will print the typing speed status
		if (wpm < 15) {
			System.out.println("very slow");
		} else if (wpm < 25)
			System.out.println("slow");
		else if (wpm < 35)
			System.out.println("Average");
		else if (wpm < 50)
			System.out.println("Good");
		else if (wpm < 60)
			System.out.println("great");
		else
			System.out.println("Pro");
	}
}
