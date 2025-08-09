class Logical
{
	public static void main(String[] args)
	{
		//System.out.println(8%2==0);
		//int x, y=1;
		//x=10;
		//if (x!=10 && x/0==0)
		//	System.out.println(y);
		//else
		//	System.out.println(++y);
		//int x=1, y=2, z=5;
		//System.out.println(!((x+2) == (1+2)));
		//System.out.println(!(y==z));
		//System.out.println(!(z&gt; x));
		//int a,b,c;
		//a=b=c=5;
		//int exp= a + b++ + ++c;
		//System.out.println(a);
		//System.out.println(b);
		//System.out.println(c);
		//System.out.println(exp);
		//int ++a=100;
		//System.out.println(++a);
		//int a=5;
		//int b=3;
		//int c=7;
		//int result= ++a + b-- * --c;
		//System.out.println(result);
		int x=10;
		int y=9;
		int z=x++ + ++x + y++ + ++y;
		//x=++x;
		//x=--x;
		//x=x++;
		//x=x--;
		System.out.println(z);
	}
}