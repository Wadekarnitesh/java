import java.util.Scanner;
class CountPalindrome
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = sc.nextInt();
		int reverse = 0;
		int temp = num;
		int count = 0;
		
		for(;num!=0; count++)
		{
			int rem = num%10;
			reverse = reverse*10+rem;
			num/=10;
		}
		if(temp==reverse)
		{
			System.out.println("Palindrome " +count);
		}
		else
		{
			System.out.println("Not Palindrome " +count);
		}
	}
}