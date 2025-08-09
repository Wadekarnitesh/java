import java.util.Scanner;
class AlphabetCheck
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Character: ");
		char ch = sc.next().charAt(0);
		
		//Using ifelse condition (own)
		//if(ch>='A' && ch<='Z' || ch>='a' && ch<='z')
		//{
		//	System.out.println("It is an alphabet");
		//}
		//else 
		//{
		//	System.out.println("It is not an alphabet");
		//}
		
		//Using ternary operator
		String op= (ch>='A' && ch<='Z' || ch>='a' && ch<='z') ? (ch+ " is an alphabet") : (ch+ " is not an alphabet");
		System.out.println(op);
	}
}