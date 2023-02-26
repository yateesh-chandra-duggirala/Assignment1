//Write a Java program that takes three numbers as input to calculate and print the average of the numbers.

import java.io.*;
import java.lang.*;
import java.util.*;

class Assignment7
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter three numbers to find their average:");
		float a = s.nextFloat();
		float b = s.nextFloat();
		float c = s.nextFloat();
		float d = (a+b+c)/3;
		System.out.println("The average of the numbers is: "+d);
	}
}