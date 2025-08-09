import java.util.Scanner;
class CheckFibonacci
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = sc.nextInt();
		int n1=0, n2=1, n3=0;
		
		for(int i=0; i<=num; i++)
		{
			n3=n1+n2;
			n1=n2;
			n2=n3;
			if(num==n1) // OR (num==n3)
			{
				break;			
			}
			
		}
		if(num==n1) // OR (num==n3)
		{
			System.out.println("fib");
		}
		else
			{
				System.out.println("no fib");
			}
		
	}
}