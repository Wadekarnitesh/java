class FirstEvenDigit
{
	public static void main(String[] args)
	{
		int num=1632;
		int temp=num;
		
		while(temp>=10)
		{
			temp/=10;
		}
		if(temp%2==0)
			System.out.println("Even");
		else
			System.out.println("Odd");
	}
}