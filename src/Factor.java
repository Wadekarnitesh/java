class Factor{
	public static void main(String[] args) {
		//System.out.println(factorial(6)); 
		factor(36);
	}
	public static long factorial(int a){
		if (a==0){
			return 1;
		}
		return a*factorial(a-1);
	}
	public static void factor(int a){
		for(int i=1;i<=a/2;i++){
			if(a%i==0){
				System.out.println(i);
			}
		}System.out.println(a);
	}
	
}