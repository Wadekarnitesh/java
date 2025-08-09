class NumberPattern4
{
	public static void main(String[] args)
	{
		int n=4;
		int num =1;
		char ch='a';
		
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				if(i%2==0)
				{
					System.out.print((ch++)+" ");
				}
				else
				{
					System.out.print((num++)+" ");
				}
				//System.out.print(i%2==0? (ch++)+" ":(num++)+" ");
			}
			System.out.println();
		}
	}
}