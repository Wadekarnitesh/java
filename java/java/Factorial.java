import java.util.Scanner;
class Factorial
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = sc.nextInt();
		int ans=1;
		
		
		//Using while loop 
		
		// while(num>0)
		// {
			// ans*=num;
			// num--;
			// //System.out.println(ans);
		// }
		// System.out.println(ans);
		
		
		//Using for loop
		
		// for(int times=num; times>0; times--)
		// {
			// ans*=times;
		// }
		// System.out.println(ans);
		
		
		//Using do-while loop
		
		int times=num;
		do
		{
			ans*=times;
			//System.out.println(ans);
			times--;
		}
		while(times>0);		



		System.out.println(ans);

	}

}