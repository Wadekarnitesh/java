class Return1
{
	public static void main(String[] args)
	{
		int sum = SumofDigit(2345);
		System.out.println(sum);
		
		boolean op = CheckEvenOdd(sum);
		
		if(op)
		{
			System.out.println("TRUE");
		}
		else
		{
			System.out.println("FALSE");
		}
	}
	
	public static int SumofDigit(int num)
	{
		int sum=0;
		while(num!=0)
		{
			sum+=num%10;
			num/=10;
		}
		return sum;
	}
	
	public static boolean CheckEvenOdd(int sum)
	{
		return sum%2==0;
	}
}