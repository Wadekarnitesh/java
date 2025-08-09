class HarshadNumber
{
	public static void main(String[] args)
	{
		int num = 81;
		int sum = 0;
		int temp=num;
		
		while(num!=0)
		{
			//int rem=num%10;
			sum+=num%10;
			num/=10;
		}
		if(temp!=0)
		{
			if(temp%sum==0)
				System.out.println("Harshad Number");
			else
				System.out.println("Not Harshad Number");
		}
		else
			System.out.println("Not Harshad Number");
	}
}