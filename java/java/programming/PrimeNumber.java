import java.util.Scanner;
class PrimeNumber
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		
		String op = (num<2) ? 
					("not prime") : 
					((num%2!=0 && num%3!=0 && num%5!=0 && num%11!=0) ?
					("prime"):
					((num==2 || num==3 || num==5 || num==11)?
					("prime"):
					("not prime")));
		System.out.println(op);
	}
}
		