import java.util.Scanner;
class FibonacciBetweenRange
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Start Number: ");
		int start = sc.nextInt();
		
		System.out.println("Enter the End Number: ");
		int end = sc.nextInt();
		
		int n1=0, n2=1, n3;
		
		while(n1<=end)
		{
			n3=n1+n2;
			if(n1>=start)
			{
				System.out.println(n1);
			}
			n1 = n2;
			n2 = n3;
		}
	}
}