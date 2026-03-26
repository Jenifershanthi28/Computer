package org.eh;

public class Test {
	public static void main(String[] args)
	{
	try
	{
	System.out.printf("1");
	int data = 5 / 0;
	}
	catch(ArithmeticException e)
	{
	System.out.printf("2");
	System.exit(0);// due to exit method the function stops with 2 
	}
	finally
	{
	System.out.printf("3");
	}
	System.out.printf("4");
	}
}
