class EvenNumber
{
	public static void main(String[] args)
	{
		int i=1;
		while(i<=100)
		{
			if(i%2==0) //this condition gives even number
			//if(i%2!=0)  //this condition gives odd number
			{
				System.out.println(i);
			}
			i++;
		}
	}
}