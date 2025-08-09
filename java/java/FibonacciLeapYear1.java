import java.util.Scanner;
class FibonacciLeapYear1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the start : ");
		int year = sc.nextInt();
		int n1=0, n2=1, n3;
		
		while(n1<=year)
		{
			if(n1%4==0 && n1%100!=0 || n1%400==0)
			{
				System.out.println(n1);
			}
			n3=n1+n2;
			n1=n2;
			n2=n3;
		}
	}
}