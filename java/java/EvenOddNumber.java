import java.util.Scanner;
class EvenOddNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num: ");
		int num = sc.nextInt();
		//int num=123456;
		int even=0;
		int odd=0;
		
		while(num>0)
		{
			num = num/10;
			if(num%2==0)
			{
				even++;
				
			}
	
			else
			{
				odd++;
			}
		}
		System.out.println(even);
		System.out.println(odd);
		
	}
}