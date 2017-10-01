// Stanley Liang Lab 1.1 Due 10/1/17
public class ControlStructures 
{
	public static boolean isPrime() 
	{
		int num = 229;
		for(int x=2; 2*x<=num; x++)
	{
		if(num%x==0)
		{return false;} 
		
	} 	return true;
		
	}
	public static void fooBarBaz()
	{	
		for(int x=1; x<=500; x++)
		{
		if(x%3==0)
			System.out.print((" "+"foo"));
		else if(x%7==0)
			System.out.print((" "+"Bar"));
		else if(x%10==0)
			System.out.print((" "+"Baz"));
		else if(x%3==0 && (x%7==0))
			System.out.print((" "+"fooBar"));
		else if(x%3==0 && (x%10==0))
			System.out.print((" "+"fooBaz"));
		else if(x%7==0 && (x%10==0))
			System.out.print((" "+"BarBaz"));
		else if(x%3==0 && (x%7==0) && (x%10==0))
			System.out.print((" "+"fooBarBaz"));
		else {
			System.out.print(" " + x);
		}
	}
}
	
	public static void primePrinter() 
	{
 		int x = 0;
 		int number = 0;
 		int count=0;
 		String primeNum = "";
 		for (x = 1;  x <= 229; x++) {
 			int counter=0;
 			for (number=x; number>=1; number--) {
 			
 			if (x % number == 0) {
 				counter = counter +1;
 				}
 			}
 			if (counter==2) {
 				System.out.print(" " +x);
 				count ++;
 			if (count==10) {
 				System.out.print("\n");
 				count =0;
 			}
 			primeNum = primeNum + x + " ";
 			}
 		}
 	}
	public static void main(String[] args)
	{
		primePrinter();
		fooBarBaz();
	}
}