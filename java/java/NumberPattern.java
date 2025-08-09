class NumberPattern
{
	public static void main(String[] args)
	{
		int n=4;
		
		for(int i=0; i<n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				System.out.print(j+" ");
				//System.out.print(i+" "); //own
			}
			System.out.println();
		}
	}
}