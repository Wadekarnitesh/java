import java.util.Scanner;
class Ternary
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the character: ");
		char ch=sc.next().charAt(0);
		
		String ans=(ch>='0' && ch<='9') ? (ch+" is a Digit") : (ch>=65 && ch<=90 || ch>=97 && ch<=122) ? 
		((ch>=65 && ch<=90) ? (ch+" is a Uppercase Character") : (ch+" is a Lowercase Character")) : (ch+" is a Special Character");
		
		System.out.println(ans);
	}
}