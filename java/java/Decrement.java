class Decrement
{
	public static void main(String[] args)
	{
		int poc=100;
		System.out.println(--poc);//99
		System.out.println(poc--);//99
		System.out.println(--poc);//97
		System.out.println(poc-- + --poc);//97 + 95 = 192
		System.out.println(poc);//95
		System.out.println(--poc + poc--);//94 + 94 = 188
		System.out.println(poc);//93
	}
}