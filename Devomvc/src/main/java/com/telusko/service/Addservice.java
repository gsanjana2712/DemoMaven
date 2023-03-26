package com.telusko.service;

public class Addservice 
	{
		public int operation(int i,int j,String operator)
		{
			if (operator.equals("+"))
				{
				return i+j;		
				}
			else if (operator.equals("-"))
			{
			return i-j;		
			}
			else if (operator.equals("*"))
			{
			return i*j;		
			}
			else if (operator.equals("/"))
			{
				try {
				            return i/j;	
				}
				
				catch(ArithmeticException e)
				{
					
					System.out.println(e.toString());
						return 0;
						
				}
			
			}
			else
			{
				return 0;
			}
			
		}
		/*public int sub(int i,int j)
		{
			return i-j;
		}*/
	}

