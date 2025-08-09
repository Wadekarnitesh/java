import java.util.Scanner;
class CheckFibonacciPrime
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = sc.nextInt();
		int n1=0, n2=1, n3, den=2;
		
		for(; den<num; den++)
		{
			n3=n1+n2;
			if(n3%den==0)
			{
				break;			
			}
			n1=n2;
			n2=n3;
			
			
		}
		if(den==num)
		{
			System.out.println("Prime");
		}
		else
		{
			System.out.println("No Prime");
		}
		
	}
}