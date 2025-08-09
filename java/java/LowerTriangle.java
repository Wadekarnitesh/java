class LowerTriangle
{
	public static void main(String[] args)
	{
		int n=7;
		int star=n/2, space=n/2;
		for(int i=0; i<n/2; i++)
		{
			for(int j=0; j<space; j++)
			{
				System.out.print("  ");
			}
			for(int j=0; j<star; j++)
			{
				System.out.print("* "+"  ");
			}
			System.out.println();
		
			
				space++;
				star--;
			
		}
	}
}