import java.util.Scanner;
class ZeroIdentify
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = sc.nextInt();
		int rem=0;
		
		//int num=1256;
		
		while(num>0)
		{
			rem=num%10;
			if(rem==0)
			{
				break;
			}
			num/=10;
		}
		if(rem==0)
		{
			System.out.println("duck");
		}
		else
			{
				System.out.println("no duck");
				
			}	
	}
}
