import java.util.Scanner;
class PinValidation
{
	public static void main(String[] args) throws InterruptedException
	{
		Scanner sc = new Scanner(System.in);
		int setPin = 2013;
		int millisec = 3000;
		
		outerLoop: //lable
		for( ; ; )
		{
			int attempt = 3;
			
			do
			{
				System.out.println();
				System.out.println("Enter the pin: ");
				int pin = sc.nextInt();
				
				if(pin==setPin)
				{
					System.out.println("UNLOCK PHONE");
					break outerLoop; //terminate
				}
				
				else
				{
					System.out.println("INVALID PIN");
					System.out.println("Attempt Left : "+(attempt-1));
					
				}
				
				attempt--;
			}
			while(attempt>=1);
			
			
			System.out.println();
			System.out.println("Phone is Disabled for " + (millisec/1000) + " seconds");
			java.lang.Thread.sleep(millisec);
			millisec *= 2;
		}
		
	}
}