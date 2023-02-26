//Write a Java program that takes two numbers as input and display the product of two numbers.

import java.io.*;
import java.lang.*;
import java.util.*;

class Assignment5
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two values to print the product of them:");
		int a = s.nextInt();
		int b = s.nextInt();
		int c = a*b;
		System.out.println("The Product of the two numbers is : "+c);
	}
}