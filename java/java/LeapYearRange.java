import java.util.Scanner;
class LeapYearRange
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the start : ");
		int y1 = sc.nextInt();
		
		System.out.println("Enter the end : ");
		int y2 = sc.nextInt();
		
		while(y1<=y2)
		{
			if(y1%4==0 && y1%100!=0 || y1%400==0)
			{
				System.out.println(y1);
			}
			
			y1++;
		}
	}
}
