class SecondMin{
	public static void main(String[] args) {
		int n=4673;
		int min=10;
		int secMin=10;
		  while (n != 0) {
            int last = n % 10;

            if (last < min) {
                secMin = min;
                min = last;
            } else if (last > min && last < secMin) {
                secMin = last;
            }
			n/=10;
		}
		System.out.println(secMin);
	}
}