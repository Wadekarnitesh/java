class SecondMax{
	public static void main(String[] args) {
		int n=4358;
		int max=-9;
		int secMax=-9;
		while(n!=0){
			int last=n%10;
			if (last > max) 
			{
             secMax = max;
             max = last;
             }
             else if (last > secMax && last < max) 
            {
            secMax = last;
            }
            n/=10;
		}
		System.out.println(secMax);

	}
}