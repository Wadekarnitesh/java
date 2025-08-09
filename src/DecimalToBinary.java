class DecimalToBinary{
	public static void main(String[] args) {
		int n=10;//1010
		int bin=0;
		int i=1;
		while(n!=0){
			int last=n%2;
			bin=i*last+bin;
			i*=10;
			n/=2;
		}
		System.out.println(bin);
	}
}