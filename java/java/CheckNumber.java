// class CheckNumber
// {
	// public static void main(String[] args)
	// {
		// int num=12345678;
		// int search=3;
		
		// for(int i=0; i<=num; i++)
		// {
			// int rem=num%10;
			// if(rem==search)
			// {
				// System.out.println(search);
			// }
			// num/=10;
		// }
	// }
// }

import java.util.Scanner;
class CheckNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		System.out.println("Enter the search number: ");
		int search = sc.nextInt();
		int rem=0;
		//for(int i=0; i<=num; i++) //OR
		for( ; num!=0; num/=10)
		{
			rem=num%10;
			if(rem==search)
			{
				break;
			}
			//num/=10;
		}
		if(rem==search)
			{
				System.out.println("Number belongs to given number " +search);
			}
		else
		{
			System.out.println("Not Found");
		}
	}
}