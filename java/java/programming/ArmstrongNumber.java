import java.util.Scanner;
class ArmstrongNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int last=0;
		int temp=num;
		int result=0;
		
		int countTemp=num;
		while(countTemp>0)
		{
			countTemp/=10;
			last++;
		}
		
		while(num>0)
		{
			int rem = num%10;
			int power=1;
			for(int i=1; i<=last; i++)
			{
				power*=rem;
			}
			result+=power;
			num/=10;
		}
		System.out.println("Result: "+result);
		
		if(result==temp)
			System.out.println("Armstrong Number");
		else
			System.out.println("Not an Armstrong Number");
	}
}