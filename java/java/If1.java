class Increment
{
	public static void main(String[] args)
	{
		int poc=100;
		System.out.println(++poc);//101
		System.out.println(poc++);//101
		System.out.println(++poc);//103
		System.out.println(poc++ + ++poc);//103 + 105 = 208
		System.out.println(poc);//105
		System.out.println(++poc + poc++);//106 + 106 = 212
		System.out.println(poc);//107
	}
}