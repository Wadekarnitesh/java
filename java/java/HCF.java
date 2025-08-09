import java.util.Scanner;
class HCF
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter the second number: ");
		int num2 = sc.nextInt();
		int i=1;
		int small = num1<num2 ? num1 : num2;
		
		while(true)
		{
			if(num1%(small*i)==0 && num2%(small*i)==0)
			{
				System.out.println(small*i);
				break;
			}
			small--;
		}
	}
}