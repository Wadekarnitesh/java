class NumberPattern3
{
	public static void main(String[] args)
	{
		int n=8;
		
		for(int i=1; i<=n; i++) //own
		{
				System.out.print(i+" "+(i+n));
				System.out.println();
		}
		
		//OR
		
		// int num=1; //class in another way
		// for(int i=1; i<=n; i++)
		// {
			// num=i;
			// System.out.print(i+" ");
			
			// for(int j=1; j<n; j++, num+=4)
			// {
				// System.out.print((num+4)+" ");
			// }
			// System.out.println();
		// }
	}
}