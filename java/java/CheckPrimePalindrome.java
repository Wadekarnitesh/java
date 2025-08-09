import java.util.Scanner;
class CheckPrimePalindrome
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = sc.nextInt();
		int reverse = 0;
		int temp=num;
		int den=2;
		
		for(; num!=0 ; num/=10)
		{
			int rem= num%10;
			reverse=reverse*10+rem;
		}
		
		if(temp==reverse)
		{
			for(;den<temp;den++)
			{
				if(temp%den==0)
				{
					break;
				}
			}
		
			if(den==temp)
			{
				System.out.println("Prime palindrome");
			}
			else
			{
				System.out.println("Not prime but palindrome");
			}
		}
		else
		{
			System.out.println("Not prime palindrome");
		}
	}
}