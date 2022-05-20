package day0;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		/*
         * Day 0: Hello, World!
         * To complete this challenge, you must save a line of input from
         * stdin to a variable, print Hello, World. on a single line, and
         * finally print the value of your variable on a second line.
         */
        System.out.println("Hello, World.");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        scanner.close();
        System.out.println(inputString);
	}

}
