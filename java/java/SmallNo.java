class SmallNo
{
	public static void main(String[] args)
	{
		int a=50;
		int b=35;
		int c=34;
		
		//int ans=(a<b)?(b<c ? b:c): c;
		//int ans=(a<b ? a : b)<c?(a<b?a:b):c;
		int ans=a<(b<c?b:c)?b:(c<a?c:a);
		System.out.println(ans);
	}
}