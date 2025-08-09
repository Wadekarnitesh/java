import java.util.Scanner;
class LeapYear
{
	public static void main(String[] args)
	{	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year: ");
		int lp=sc.nextInt();
		//int lp=2000;
		//while(lp <= 2500)
		//{
			if((lp%4==0 && lp%100!=0) || (lp%400==0))
			{
				System.out.println(lp+" It is leap year");
			}
			else
			{
				System.out.println(lp+" It is not a leap year");
			}
			//lp++;
		//}
	}
}