import java.util.Scanner;
class EVM
{
	static int bjp, mns, ss, ncp, nota;
	
	public static void main(String[] args)
	
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("----------WELCOME IN EVM------------------");
		System.out.println();
		System.out.print("Enter the population: ");
		int pop=sc.nextInt();
		System.out.println();
		
		for(int i=1; i<=pop; i++)
		{
			System.out.println();
			System.out.println(" List of Parties ");
			System.out.println("1. BJP");
			System.out.println("2. MNS");
			System.out.println("3. SHIVSENA");
			System.out.println("4. NCP");
			System.out.println("5. NOTA");
			System.out.println();
			System.out.print("Enter your vote: ");
			String response=sc.next().toUpperCase();
		
			switch(response)
			{
				case "BJP":
				{
					bjp++;
					System.out.println("YOU HAVE GIVEN A VOTE FOR BJP");
					System.out.println("ACCHE DIN AYENGE");
					break;
				}
				case "MNS":
				{
					mns++;
					System.out.println("YOU HAVE GIVEN A VOTE FOR MNS");
					System.out.println("JAI MAHARASHTRA");
					break;
				}
				case "SHIVSENA":
				{
					ss++;
					System.out.println("YOU HAVE GIVEN A VOTE FOR SHIVSENA");
					System.out.println("HUM HAI ASLI SENA");
					break;
				}
				case "NCP":
				{
					ncp++;
					System.out.println("YOU HAVE GIVEN A VOTE FOR NCP");
					System.out.println("RASHTRAWADI PUNHA");
					break;
				}
				case "NOTA":
				{
					nota++;
					System.out.println("YOU HAVE GIVEN A VOTE FOR NOTA");
					System.out.println("OHHH U ARE EDUCATED");
					break;
				}
				default:
				{ 	
					System.out.println("INVALID PARTY NAME");
					i--;
					break;
				}
			}
		}
		
		if(bjp>=mns && bjp>=ss && bjp>=ncp && bjp>=nota)
		{
			System.out.println("BJP HAS WON THE ELECTION BY: "+bjp+" VOTES");
		}
		
		else if(mns>=bjp && mns>=ss && mns>=ncp && mns>=nota)
		{
			System.out.println("MNS HAS WON THE ELECTION BY: "+mns+" VOTES");
		}
		
		else if(ss>=mns && ss>=bjp && ss>=ncp && ss>=nota)
		{
			System.out.println("SHIVSENA HAS WON THE ELECTION BY: "+ss+" VOTES");
		}
		
		else if(ncp>=mns && ncp>=ss && ncp>=bjp && ncp>=nota)
		{
			System.out.println("NCP HAS WON THE ELECTION BY: "+ncp+" VOTES");
		}
		
		else 
		{
			System.out.println("NOTA HAS WON THE ELECTION BY: "+nota+" VOTES");
		}
		
	}
}
