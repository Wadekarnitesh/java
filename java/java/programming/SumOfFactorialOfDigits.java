import java.util.Scanner;
class SumOfFactorialOfDigits
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int temp = num;
		int sum = 0;
		
		// while(num>0)
		// {
			// int last = num%10;
			// int fact = 1;
			// for(int i=1; i<=last; i++)
			// {
				// fact*=i;

			// }
			// sum+=fact;
			// num/=10;
		// }
		
		//OR
		
		for( ;num>0; num/=10)
		{
			int last = num%10;
			int fact = 1;
			while(last>1) //why here use 1 not 0
			{
				fact*=last;
				last--;
			}
			sum+=fact;
		}
		//System.out.println("Sum: "+sum);
		if(temp==sum)
			System.out.println("It is Strong Number");
		else
			System.out.println("It is not Strong Number");
	}
}