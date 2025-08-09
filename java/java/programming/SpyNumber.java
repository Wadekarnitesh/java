import java.util.Scanner;
class SpyNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int a = sc.nextInt();
		int sum=0;
		int product=1;
		
		for(; a!=0; a/=10)
		{
			int rem = a%10;
			sum=sum+rem;
			product=product*rem;
		}
		if(sum==product)
		{
			System.out.println("Spy Number");
		}
		else
		{
			System.out.println("Not Spy Number");
		}
	}
}