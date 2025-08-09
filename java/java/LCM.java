import java.util.Scanner;
class LCM
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter the second number: ");
		int num2 = sc.nextInt();
		int i=1;
		
		int large = num1>num2 ? num1 : num2;
		
		while(true)
		{
			if((large*i)%num1==0 && (large*i)%num2==0)
			{
				System.out.println(large*i);
				break;
			}
			i++;
		}
	}
}