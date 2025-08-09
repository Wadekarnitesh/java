class DoWhile2
{
	public static void main(String[] args)
	{
		int i=1;
		do
		{
							//System.out.println(i);  //prints even or odd no double

			//if(i%2!=0)  // for odd number
			if(i%2==0)  // for even number
			{
				System.out.println(i);
				
			}
			i++;
							//System.out.println(i);  //prints even or odd no double

		}
		while(i<=100);
	}
}