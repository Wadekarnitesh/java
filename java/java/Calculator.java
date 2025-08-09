import java.util.Scanner;
class Calculator
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("*************CALCULATOR***************");
		System.out.println("Operations:");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
			
		System.out.println("Enter the first number: ");
		int n1=sc.nextInt();
		System.out.println("Enter the second number: ");
		int n2=sc.nextInt();
		
		System.out.println("Choose the operation: ");
		int ip=sc.nextInt();
		
		switch(ip)
		{
			case 1:
				int res=n1+n2;
				System.out.println("Addition of n1 & n2 is: "+res);
				break;
				
			case 2:
				int res1=n1-n2;
				System.out.println("Sutraction of n1 & n2 is: "+res1);
				break;
				
			case 3:
				int res2=n1*n2;
				System.out.println("Multiplication of n1 & n2 is: "+res2);
				break;
				
			case 4:
				int res3=n1/n2;
				System.out.println("Division of n1 & n2 is: "+res3);
				break;
				
			default:
				System.out.println("No such opertion");
		}
	}
}
		