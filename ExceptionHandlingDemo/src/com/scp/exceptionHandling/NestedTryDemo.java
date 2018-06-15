package com.scp.exceptionHandling;

public class NestedTryDemo {

	public static void main(String[] args) 
	{
		System.out.println("inside main");
		//m1();
		System.out.println(m1());
	}
	
	public static int m1()
	{
		try
		{
			System.out.println("first try");
			try
			{
				System.out.println("second try");
				try
				{
					System.out.println("third try");
					System.out.println(10/0);
					
				}
				catch(Exception e)
				{
					System.out.println("third catch");
				}
				finally
				{
					System.out.println("third finally");
					//return 20;
				}
				
			}
			catch(Exception e)
			{
				System.out.println("second catch");
			}
			
			System.out.println(10/0);
			
		}
		catch(Exception e)
		{
			System.out.println("first catch");			
		}
		finally
		{
			System.out.println("first finally");
			return 50;
		}
		
		//return 0;
	}

}
