class Compound
{
	public static void main(String[] args)
	{
		int sal=9000;
		//sal= sal+764; // not use this it is old method
		//System.out.println(sal);//9764
		//sal+=764;
		//System.out.println(sal);//9764
		
		//sal*=3;
		//System.out.println(sal);//27000
		
		//sal=sal+405.29;// It is not possible to convert in double to int possible
		sal+=405.29;// It is only [possibleby this way implicitly(in narrowing)
		System.out.println(sal);//9405
		
		//sal=sal+40*20;
		//sal+=40*20;
		//System.out.println(sal);//9800
	}
}