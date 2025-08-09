class NumberPattern1
{
	public static void main(String[] args)
	{
		int n=8;
		
		for(int i=1; i<=n; i++)
		{
			System.out.print(" ");
			for(int j=0; j<n; j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}