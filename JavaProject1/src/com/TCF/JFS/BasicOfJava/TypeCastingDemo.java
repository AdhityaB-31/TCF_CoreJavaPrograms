package com.TCF.JFS.BasicOfJava;

public class TypeCastingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Implicit Casting (smaller to larger data type)
	    int intVal = 143;
	    double doubleVal = intVal;
	    System.out.println("Implicit Casting int to double: " + doubleVal);
	    // Explicit Casting (larger to smaller data type)
	    double doubleValue = 143.43;
        int intValue = (int) doubleValue;
        System.out.println("Explicit Casting double to int: " + intValue);

        // Char to int and vice versa
        char letter = 'd';
        int ascii = letter;
        System.out.println("ASCII value of d: " + ascii);

        int num = 72;
        char character = (char) num;
        System.out.println("Character for ASCII 72: " + character);
	}

}
