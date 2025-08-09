class SecondMax{
	public static void main(String[] args) {
		int n=4358;
		int max=-9;
		int SecMax=-9;
		while(n!=0){
			int last=n%10;
			max=last>max? last:max;
			SecMax=max;
			n/=10;
		}
		System.out.println(SecMax);

	}
}