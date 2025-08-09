import java.util.Scanner;
class FibonacciLeapYearRange
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the start : ");
		int y1 = sc.nextInt();
		
		System.out.println("Enter the end : ");
		int y2 = sc.nextInt();
		int n1=0, n2=1, n3;
		
		while(n1<=y2)
		{
							n3=n1+n2;

			if(n1>=y1)
			{
				if(n1%4==0 && n1%100!=0 || n1%400==0)
				{
					System.out.println(n1);
				}
				n1=n2;
				n2=n3;
			}
		}
	}
}