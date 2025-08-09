import java.util.Scanner;
class StonePaperScissorGame
{
	public static void main(String[] args)
	{
		
		//initi response of bot is zero
		
		int botResp=0;
		
		//we don't know when we will get a number between 1 to 3
		//thats why we used an infinite loop
		
		for(; ;)
		{
			botResp=(int)(Math.random()*9);//Math.random is used to generate the random values
			if(botResp>=1 && botResp<=3){
				break;  //terminates the infinite loop when the digit is in a givem range
			}
		}
	
		Scanner sc = new Scanner(System.in);
		System.out.println("  WELCOME  ");
		System.out.println();
		System.out.println("1. STONE  2. PAPER  3. SCISSOR");
		System.out.print("Enter your response: ");
		int userResp = sc.nextInt();
		
		//range to check user response is valid or not
		
		if(userResp<=0 || userResp>=4)
		{
			System.out.println("INVALID RESPONSE");
			return;  //terminate the whole execution
		}
		
		String botResponse = " ";  //empty
		String userResponse = " ";  //empty
		
		//bot response stored
		
		switch(botResp)
		{
			case 1:
				botResponse = "STONE";
				break;
			
			case 2:
				botResponse = "PAPER";
				break;
				
			case 3:
				botResponse = "SCISSOR";
				break;
		}
		
		//user response stored
		
		switch(userResp)
		{
			case 1:
				userResponse = "STONE";
				break;
				
			case 2:
				userResponse = "PAPER";
				break;
				
			case 3:
				userResponse = "SCISSOR";
				break;
		}
		
		System.out.println("  BOT   :   USER  ");
		System.out.println(botResponse+"        "+userResponse);
		
		//we have to calculate the winner
		
		if((botResponse.equals("STONE") && userResponse.equals("PAPER")) ||
			(botResponse.equals("PAPER") && userResponse.equals("SCISSOR")) ||
			(botResponse.equals("SCISSOR") && userResponse.equals("STONE")))
		{
			System.out.println("USER WINS");
		}
		
		else if((botResponse.equals("PAPER") && userResponse.equals("STONE")) ||
			(botResponse.equals("SCISSOR") && userResponse.equals("PAPER")) ||
			(botResponse.equals("STONE") && userResponse.equals("SCISSOR")))
		{
			System.out.println("BOT WINS");
		}
		
		else
		{
			System.out.println("DRAW");
		}
	}
}