class Widening2
{
	public static void main(String[] args)
	{
		
		int i=100;
		System.out.println(i);//100
		
		long k=i;
		System.out.println(k);//100
		
		float l=k;
		System.out.println(l);//100.0
		
		float p=i;
		System.out.println(p);//100.0
		
		double d = l;
		System.out.println(d);//100.0
	}
}