import java.util.Scanner;
class LoanCalculator
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		for(; ;)
		{
			System.out.println("LOAN CALCULATOR");
			System.out.println();
			System.out.println("1. Home Loan");
			System.out.println("2. Gold Loan");
			System.out.println("3. Vehicle Loan");
			System.out.println("4. Education Loan");
			System.out.println("5. Personal Loan");
			System.out.println();
			System.out.println("Enter Your Option: ");
			int opt = sc.nextInt(); // 1 to 5
			System.out.println();
			double roi = 0; //?
			String loanType = null; //?
			String assump = "VALID";
			
			switch(opt)
			{
				case 1:
				{
					loanType = "Home Loan";
					roi = 8.45;
					break;
				}
				case 2:
				{
					loanType = "Gold Loan";
					roi = 3;
					break;
				}
				case 3:
				{
					loanType = "Vehicle Loan";
					roi = 12;
					break;
				}
				case 4:
				{
					loanType = "Education Loan";
					roi = 9.5;
					break;
				}
				case 5:
				{
					loanType = "Personal Loan";
					roi = 16;
					break;
				}
				default:
				{
					System.out.println("Invalid Option");
					assump = "NOT VALID";
					break;
				}
			}
			if(assump == "NOT VALID")
				continue;  //terminate
				
			//calculation
			System.out.println("Enter the amount: ");
			double amount = sc.nextDouble();
			if(amount<10000 || amount>5000000)
			{
				System.out.println("INVALID AMOUNT ENTERED");
				continue;
			}
			System.out.println("Enter the tenure in years: ");
			double tenure = sc.nextDouble();
			if(tenure<1 || tenure>20)
			{
				System.out.println("INVALID TENURE");
				continue;
			}
			
			System.out.println();
			System.out.println("Loan Type: "+loanType);
			System.out.println("Principal Amount: "+amount+ "rs");
			System.out.println("Rate of Interest: "+roi+" rs");
			System.out.println("Tenure: "+tenure+" rs");
			
			double interest = (amount*roi/100)*tenure;
			System.out.println("Interest: "+interest+" rs");
			System.out.println("Total Loan Amount: "+(amount+interest));
			System.out.println("EMI: "+(amount+interest)/(tenure*12));
		}
	}
}