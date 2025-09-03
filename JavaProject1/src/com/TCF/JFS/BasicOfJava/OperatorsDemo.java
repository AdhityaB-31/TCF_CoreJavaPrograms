package com.TCF.JFS.BasicOfJava;

public class OperatorsDemo {
	public static void main(String[] args) {
		int a = 10, b = 5;

        // Arithmetic Operators
        System.out.println("Addition: " + (a + b));			//Addition
        System.out.println("Subtraction: " + (a - b));		//Subraction
        System.out.println("Multiplication: " + (a * b));	//Multiple/Produce
        System.out.println("Division: " + (a / b));			//Division
        System.out.println("Modulus: " + (a % b));			//Modulus

        // Relational Operators
        System.out.println("a > b: " + (a > b));	//Greater than
        System.out.println("a == b: " + (a == b));	//Is Equal
        System.out.println("a < b: " + (a<b));		//Less than
        System.out.println("a != b: " + (a!=b)); 	//Not-Equals

        // Logical Operators
        boolean x = true, y = false;
        System.out.println("x && y: " + (x && y)); 	//AND
        System.out.println("x || y: " + (x || y)); 	//OR
        System.out.println("!x: " + (!x));			//NOT

        // Assignment Operator
        int c = a + b;
        System.out.println("Assigned value (c): " + c);

        // Increment & Decrement
        a++;	//Increment Operator
        b--;	//Decrement Operator
        System.out.println("Incremented a: " + a);
        System.out.println("Decremented b: " + b);
	}
}
