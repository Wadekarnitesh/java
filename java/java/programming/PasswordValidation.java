import java.util.Scanner;
class PasswordValidation
{
	public static void main(String[] args) throws InterruptedException
	{
		Scanner sc = new Scanner(System.in);
		int storePin = 2013;
		int millisec = 3000;
		
		outerLoop: //lable
		for( ; ; )
		{
			//int attempt = 0; //own
			int attempt = 3;
			
			do
			{
				System.out.println();
				System.out.println("Enter your pin: ");
				int newPin = sc.nextInt();
				
				if(newPin==storePin)
				{
					System.out.println("Phone is Unlocked");
					break outerLoop; //terminate
				}
				
				else
				{
					System.out.println("Invalid pin");
					System.out.println("Attempt Left : "+(attempt-1)); 
					//System.out.println("Attempt Left : "+attempt); //own
					
				}
				attempt--;
				//attempt++; //own
			}
			while(attempt>=1);
			//while(attempt<=4); //own
			
			
			System.out.println();
			System.out.println("Phone is Disabled for " + (millisec/1000) + " seconds");
			java.lang.Thread.sleep(millisec);
			millisec *= 2;
			
		}
		
	}
}