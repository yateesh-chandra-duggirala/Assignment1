//Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.

import java.lang.*;
import java.io.*;
import java.util.*;

public class Assignment6
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two numbers:");
		float a = s.nextFloat();
		float b = s.nextFloat();
		System.out.println("1. Sum : "+(a+b));
		System.out.println("2. Difference : "+(a-b));
		System.out.println("3. Product : "+(a*b));
		System.out.println("4. Quotient : "+(a/b));
		System.out.println("5. Remainder : "+(a%b));
	}
}