class SumSquareDifference
{
	public static void main(String[] args)
	{
		int sum=0;
		int a=0;
		int b=0;
		int result=0;
		for(int num=1; num<=10; num++)
		{
			int square=num*num;
			sum+=square;
			a+=num;
			b=a*a;
			result=b-sum;
		}
		System.out.println(sum);
		System.out.println(b);
		System.out.println(result);
	}
}

//OR

// class SumSquareDifference
// {
	// public static void main(String[] args)
	// {
		// int num=10; int sum=0;
		// int sumofSquare=0;
		// for(int i=0; i<=num; i++)
		// {
			// sum+=i;
			// sumofSquare+=(i*i);
		// }
		// System.out.println(sumofSquare);
		// System.out.println(sum*sum);
		// System.out.println((sum*sum)-sumofSquare);
	// }
// }