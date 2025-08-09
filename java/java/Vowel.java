import java.util.Scanner;
class Vowel
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the character:");
		char ch=sc.next().charAt(0);
		
		if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
		{
			switch(ch)
			{
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
				case 'A':
				case 'E':
				case 'I':
				case 'O':
				case 'U':
				{
					System.out.println("It is a Vowel");
					break;
				}
				default:
					System.out.println("It is a Consonant");
			}
		}
		else
		{
			//System.out.println("It is not an alphabet");
			System.out.println("Please enter the correct alphabet");
		}
	}
}
			