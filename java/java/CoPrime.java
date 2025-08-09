class CoPrime
{
	public static void main(String[] args)
	{
		int n1=16;
		int n2=27;
		
		int small = n1<n2 ? n1:n2;
		
		for(;true;small--)
		{
			if(n1%small==0 && n2%small==0)
			{
				break;
			}
		}
		if(small==1)
		{
			System.out.println("CoPrime");
		}
		else
		{
			System.out.println("Not CoPrime");
		}
	}	
}