import java.util.Scanner;
class EvilRange
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
			int count=0;
			int temp=num;
			
			while(num!=0)
			{
				if(num%2==1)
				{
					count++;
				}
				num/=2;
			}
			if(count%2==0)
				System.out.println(temp+" Evil Number");
			//else
			//	System.out.println(temp+" Not Evil Number");
		}
	}
}