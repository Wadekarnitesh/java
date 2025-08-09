import java.util.Scanner;
class VowelConsonant
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the character: ");
		char ch=sc.next().toUpperCase().charAt(0);
		
		String op=(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') ? 
				  (ch+" is a vowel"):(ch+" is a consonant");
		System.out.println(op);
	}
}