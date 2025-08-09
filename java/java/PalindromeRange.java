import java.util.Scanner;
class PalindromeRange
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter the second number: ");
		int num2 = sc.nextInt();
		
		
		// for(int i=num1; i<=num2; i++)
		// {
			// int last = 0;
			// int reverse = 0;
			// int temp = i;
			// while(temp>0)
			// {
				// last = temp%10;
				// reverse = reverse*10+last;
				// temp/=10;
			// }
			// if(reverse==i)
			// {
				// System.out.println(i);
			// }
		// }
		
		//OR
		while(num1<=num2)
		{
			int i =num1; //copy or store the number in temporary variabe
			int temp=i;  //copy or store the original number
			int last=0;
			int reverse=0;
			
			while(i!=0)
			{
				last=i%10;
				reverse=reverse*10+last;
				i/=10;
			}
			if(reverse==temp)
			{
				System.out.println(temp);
			}
			num1++;
		}
		
	}
}


