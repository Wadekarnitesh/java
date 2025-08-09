import java.util.Scanner;
class PerfectNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num = sc.nextInt();
		int sum = 0;
		
		for(int den=1; den<=num/2; den++)
		{
			if(num%den==0)
			{
				sum+=den;
			}
		}
		if(sum==num)
			System.out.println("Perfect Number");
		else
			System.out.println("Not a Perfect Number");
	}
}