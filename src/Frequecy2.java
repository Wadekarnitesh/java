class Frequency2{
	public static void main(String[] args) {
		int n=234336423;
		int temp=n;
		int carry=n;
	
		while(carry!=0){
			int last=carry%10;
				int count=0;
				temp=n;
			for (;temp!=0 ;temp/=10 ) {
				if(last==temp%10){
					count++;
				}	
			}
			System.out.println(last+  "  "+count);
			carry/=10;

		}
	}
}