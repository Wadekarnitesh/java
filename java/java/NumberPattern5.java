class NumberPattern5
{
	public static void main(String[] args)
	{
		int n=4;
		int num=1;
		char ch='a';
		
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				//System.out.print(i%2==0 ? (num++)+" " : (ch++)+" ");
				if(i%2==0)
				{
					System.out.print((num++)+" ");
				}
				else
				{
					System.out.print((ch++)+" ");
				}
			}
			System.out.println();
		}
	}
}