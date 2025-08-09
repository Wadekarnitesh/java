import java.util.Scanner;
class CountPrime
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = sc.nextInt();
		int den = 0;
		int count = 1;
		
		for(;den<num;den++)
		{
			if(num%den==0)
			{
				break;
			}
			count++;
		}
		if(num==den)
		{
			System.out.println("Prime " +count);
		}
		else
		{
			System.out.println("Not Prime " +count);
		}
			
	}
}