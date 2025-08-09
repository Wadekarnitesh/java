import java.util.Scanner;
class StrontioRange
{
	public static void main(String[] args)
	{
		System.out.println("Start No.: ");
		int start = new Scanner(System.in).nextInt();
		System.out.println("Last No.: ");
		int end = new Scanner(System.in).nextInt();
		for(int i=start; i<=end; i++)
		{
			if(i>=1000 && i<=9999)
			{
				int mul=i*2;
				int temp = mul/10;
				int tenDigit = temp%10;
				int hundredDigit = (temp/10)%10;
			
				if(tenDigit==hundredDigit)
				{
					System.out.println(i+" Strontio Number");
				}
				else{
					System.out.println(i+" Not Strontio Number");
				}
			}
		}
	}
}