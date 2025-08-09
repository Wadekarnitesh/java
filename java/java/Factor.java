import java.util.Scanner;
class Factor
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		
		int den = 1;
		
		//while(den<=num)
		while(den<=num/2)    //bcz factorial is half of its number it is always calculated in half
		{
			
			if(num%den==0)
			{
				System.out.println(den);
				
			}
			den++;
		}
		System.out.println(num);
	}
}