
public class ControlStructures 
{
	public static boolean isPrime(int x, int num) 
	{
		for(x=2; 2*x<=num; x++)
	{
		if(num%x==0)
			{return false;}
		else
			{return true;}
	} 
		return true;
	} 
	public static boolean fBB(int a, boolean foo, boolean Bar, boolean Baz, boolean fooBar, boolean fooBaz, boolean BarBaz, boolean fooBarBaz)
	{
		if(a%3==0)
		{return foo;}
		else if(a%7==0)
		{return Bar;}
		else if(a%10==0)
		{return Baz;}
		else if(a%3==0 && (a%7==0))
		{return fooBar;}
		else if(a%3==0 && (a%10==0))
		{return fooBaz;}
		else if(a%7==0 && (a%10==0))
		{return BarBaz;}
		else if(a%3==0 && (a%7==0) && (a%10==0))
		{return fooBarBaz;}
		return true;
	} 
}