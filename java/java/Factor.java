class Factor
{
	public static void factor(int a){
		for(int i=2;i<a/2;i++){
			if(a%i==0){
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args) {
		factor(40);
    }
}