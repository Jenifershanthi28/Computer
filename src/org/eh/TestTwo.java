package org.eh;

public class TestTwo {
	public static void main(String[] args)
	{
	try
	{
	System.out.printf("1");
	int data = 5 / 0;
	}
	catch(ArithmeticException e)
	{
	Throwable obj = new Throwable("Sample");// super exception class
	try
	{
	throw obj;
	}
	catch (Throwable e1)
	{
	System.out.printf("8");
	}
	}
	finally
	{
	System.out.printf("3");
	}
	System.out.printf("4");
	}
}
// 2 try blocks used here by creating new object for super exception class 