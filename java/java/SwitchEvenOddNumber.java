import java.util.Scanner;
class SwitchEvenOddNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		
			switch(num%2)
			{
				case 0:
				
					switch(num)
					{
						case 0:
							System.out.println("Zero is neither positive nor negative");
							break;
							
						case 2:
							System.out.println("Two is the smallest prime even number");
							break;
						
						case 10:
							System.out.println("Ten is a double digit even number");
							break;
							
						default:
							System.out.println("This is an even number");
					}
					break;
					
				case 1:
					 
					 switch(num)
					 {
						case 1:
							System.out.println("One is the first odd number");
							break;
						
						case 3:
							System.out.println("Three is a magic number!");
							break;
						
						case 7:
							System.out.println("Seven is a considered lucky!");
							break;
							
						default:
							System.out.println("This is an odd number");
							break;
					 }
					 
			}
		
	}
}
