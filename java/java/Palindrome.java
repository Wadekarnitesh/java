import java.util.Scanner;
class Palindrome
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = sc.nextInt();  //101
		int reverse = 0;
		int temp = num;
		
		do
		{
			int rem = num%10;  //10%10=0
			reverse = reverse*10+rem;  //1*10+0=10
			num/=10;  // 10/10=0
		}
		while(num!=0);
		
		if(temp == reverse)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("Not palindrome");
		}
		
	}
}