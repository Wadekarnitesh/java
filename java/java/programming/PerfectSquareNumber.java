import java.util.Scanner;
class PerfectSquareNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		boolean flag=false;
		
		for(int i=1; i<=num/2; i++)
		{
			//System.out.println("i= "+i);
			if(i*i==num)
			{
				flag=true;
				break;
			}
			
		}
		if(flag)
		{
			System.out.println(num+" is perfect square number");
		}
		else
		{
			System.out.println(num+" is not perfect square number");
		}
	}
}