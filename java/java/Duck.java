import java.util.Scanner;
class Duck
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = sc.nextInt();
		
		while(num>0)
		{
			if(num%10==0)
			{
				break;
			}
			num/=10;
		}
		
		if(num==0)
		{
			System.out.println("No Duck");
		}
		else
		{
			System.out.println("Duck");
		}
	}
}