class Widening1
{
	public static void main(String[] args)
	{
		double d=10;
		System.out.println(d);//10.0
		
		int i='a';
		System.out.println(i);//97
		
		float f=100l;
		System.out.println(f);//1001.0
		
		double d2=3.3333f;
		System.out.println(d2);//3.3333001136779785
		
		double d3=22/7;
		System.out.println(d3);//3.0
		
		double d4=22.0f/7.0f;
		System.out.println(d4);//3.142857074737549
		
		double d5=2217;
		System.out.println(d5);//2217.0
	}
}