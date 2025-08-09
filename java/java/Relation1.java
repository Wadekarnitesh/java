class Relation1
{
	public static void main(String[] args)
	{
		System.out.println(10<20);// true
		System.out.println(50.0>50);// false
		System.out.println(59.9999>=60);// false
		System.out.println('a'<'A');// false (according to ASCII value)
		//System.out.println(true>false);// CTE
		System.out.println(10>20);// false
		System.out.println('d'==100);// true
		//System.out.println(true=="true");// CTE
		System.out.println(false!=true);// true
		System.out.println(22/7<=22.0f/7.0f);// true
		System.out.println(22.0/7.0<22.0f/7.0f);// false
		//System.out.println(22/7);// 3
		//System.out.println(22.0/7.0);// 3.142857142857143
		//System.out.println(22.0f/7.0f);// 3.142857
	}
}