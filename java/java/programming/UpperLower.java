import java.util.Scanner;
class UpperLower
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the character: ");
		char ch=sc.next().charAt(0);
		
		//String op=(ch>='A' && ch<='Z')?(ch+" is a uppercase"):(ch+" is a lowercase");
		String op=(ch>='A' && ch<='Z')?(ch+" is a uppercase"):(ch>='a' && ch<='z')?(ch+" is a lowercase"):(ch+" is not a alphabet");
		System.out.println(op);
	}
}