import java.util.Scanner;
class DivisibleThreeNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num: ");
		int num = sc.nextInt();
		//int num=363456;
		int three=0;
		
		while(num>0)
		{
			int rem = num%10;
			if(rem%3==0)
			{
				three++;
				
			}
			num/=10;
			
		}
		System.out.println(three);
		
	}
}