package org.eh;

public class ExceptionalHandlingOne {
	private void m1()
	{
	m2();
	System.out.printf("1");
	}
	private void m2()
	{
	m3();
	System.out.printf("2");
	}
	private void m3()
	{
	System.out.printf("3");
	try
	{
	int sum = 4/0;
	System.out.printf("4");
	}
	catch(ArithmeticException e)
	{
	System.out.printf("5");
	}
	System.out.printf("7");
	}
	public static void main(String[] args)
	{
		ExceptionalHandlingOne obj = new ExceptionalHandlingOne();
	obj.m1();
	
	}
	}
//due to return type 2 and 1 printed in last

