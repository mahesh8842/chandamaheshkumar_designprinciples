

class CalciClass1 implements Calculator
{
	
	public int add(int a,int b)
	{
		return a+b;
	}
	
	
	
	public int subtract(int a,int b)
	{
		return a-b;
	}
	
	
	
	public int multiply (int a,int b)
	{
		return a*b;
	}
	
	
	
	public int divide(int a,int b)
	{
		if(b!=0)
			return a/b;
		else
		{
			System.out.println("cannot divide by zero");
			return Integer.MIN_VALUE;
		}
	}
	
	
}