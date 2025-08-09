class Narrow1
{
	public static void main(String[] args)
	{
		double d=2345.345455345454;
		float f=(float) d;
		System.out.println(f);//2345.3455
		System.out.println(d);//2345.345455345454
		
		long l=(long) d;
		System.out.println(l);//2345
		
		int i=(int) d;
		System.out.println(i);//2345
		
		short sh=(short) d;
		System.out.println(sh);//2345
		
	}
}