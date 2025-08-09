import java.util.Scanner;
class NextIntegerPerfectSquare
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int temp = num+1;
		boolean flag = false;
		
		for(int i=0; i<=num/2; i++)
		{
			//num+=1; //not correct because num value is changes according to loop so i*i & num is not equal so this statement is not correct so we store num+1 in temp because it holds that particular value
			if(i*i==temp)
			{
				flag=true;
				break;
			}
		}
		if(flag)
			System.out.println("It is Sunny Number");
		else
			System.out.println("It is not a Sunny Number");
	}
}