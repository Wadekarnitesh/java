import java.util.Scanner;
class Fibonacci1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value: ");
		int num = sc.nextInt();
		int num1= 0, num2= 1, num3, count=1;
		
		while(count<=num)
		{
			
			num3 = num1 + num2;
			System.out.println(num1);// till nth value i.e. 5
			num1 = num2;
			num2 = num3;
			count++;
		}
		//System.out.println(num1);

	}
}