import java.util.Scanner;
class DisariumRange
{
	public static void main(String[] args)
	{
		System.out.println("Start No.: ");
		int start = new Scanner(System.in).nextInt();
		System.out.println("Last No.: ");
		int end = new Scanner(System.in).nextInt();
		for(int i=start; i<=end; i++)
		{
			int num=i;
			int temp=num;
			int count = (int)Math.log10(num)+1;
			int sum=0;
			while(num>0)
			{
				int lastDigit = num%10;
				sum+=Math.pow(lastDigit, count);
				count--;
				num/=10;
			}
			if(temp==sum)
				System.out.println(temp+" Disarium Number");
			//else
			//	System.out.println(temp+" Not Disarium Number");
		}
	}
}