import java.util.Scanner;
class Digit
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the character: ");
		char ip=sc.next().charAt(0);

		String op=(ip>='0' && ip<='9')?(ip+" is a digit"):(ip+" is not a digit");
		System.out.println(op);
	}
}