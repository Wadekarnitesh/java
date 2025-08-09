import java.util.Scanner;
class CurrencyConverter
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome");
		System.out.println();
		System.out.println("1. USD");
		System.out.println("2. EUR");
		System.out.println("3. GBP");
		System.out.println("4. RUBLE");
		System.out.println("5. AED");
		System.out.println();
		System.out.println("Enter Your Response");
		String str = sc.next().toUpperCase();
		System.out.println("Enter the Amount in INR: ");
		float inr = sc.nextFloat();
		float converted=0;
		String curr="VALID";
		switch(str)
		{	
			case "USD":
			{
				converted=inr/85.5165f;
				break;
			}
			
			case "EUR":
			{
				converted=inr/97.6926f;
				break;
			}
			
			case "GBP":
			{
				converted=inr/113.938f;
				break;
			}
			
			case "RUBLE":
			{
				converted=inr/1.03620f;
				break;
			}
			
			case "AED":
			{
				converted=inr/23.2821f;
				break;
			}
			
			default:
			{
				System.out.println("INVALID CURRENCY");
				curr="INVALID";
				break;
			}
			
		}
		
		if(curr.equals("VALID"))
			{
				System.out.println(inr+ "INR" + "=" + converted + " " +str);
			}
		
	}
}