import java.util.Scanner;
class Fibonacci
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value: ");
		int num = sc.nextInt();
		int num1= 0, num2= 1, num3, i=0;
		
		while(i<num)
		{
			num3 = num1 + num2;
			System.out.println(num1);
			num1 = num2;
			num2 = num3;
			i++;
		}
	}
}