import java.util.Scanner;
class FibonacciPrime
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = sc.nextInt();
		int n1=0, n2=1, n3;
		
		while(true)
		{
			n3=n1+n2;
			if(n1==num)
			{
				System.out.println("Fibonacci Number");
				break;
			}
			else if(n1>num)
			{
				System.out.println("Not Fibonacci Number");
				break;
			}
			else if(n1<num)
			{
				n1=n2;
				n2=n3;
			}
		}
		if(n1==num)
		{
			int den=2;
			for(;den<num; den++)
			{
				if(num%den==0)
				{
					break;
				}
				
			}
			if(num==den)
			{
				System.out.println("Fibonacci Prime Number");
			}
			else
			{
				System.out.println("Fibonacci but not prime number");
			}
			
		}
		else
			{
				System.out.println("Not Fibonacci Prime Number");
			}
			
		
	}
}