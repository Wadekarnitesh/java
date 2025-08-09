class NestedLoop
{
	public static void main(String[] args)
	{
		//int days=0;
		//while(days<=7)
		//{
		//	int times=0;
		//	while(times<=5)
		//	{
		//		System.out.println("Good Morning");
		//		times++;
		//	}
		//	days++;
		//}
		
		// for(int days=0; days<=7; days++)
		// {
			// for(int times=0; times<=5; times++)
			// {
				// System.out.println("Good Morning");
				// System.out.println("*************");
			// }
			
		// }
		
		int days=0;
		do
		{
			int times=0;
			do{
				System.out.println("Good Morning");
				times++;
			}
			while(times<=5);
			days++;
		}
		while(days<=7);
		
	}
}