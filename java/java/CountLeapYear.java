class CountLeapYear
{
	public static void main(String[] args)
	{
		int start=2000;
		int end=3000;
		int count=0;
		
		while(start<=end)
		{
			if(start%4==0 && start%100!=0 || start%400==0)
			{
				count++;
			}
			start++;
		}
		System.out.println(count);
	}	
}