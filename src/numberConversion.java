public class numberConversion {
    public static void main(String[] args) {
        // decimalToBinaty(36);
        decimalToBinaty1(36);
        binaryToDecinal(10101);
    }
    
    public static void binaryToDecinal(int n){
        int num=n,bin=0,i=1;
        while(num>0){
            int rem=num%10;
            bin=rem*i+bin;
            num/=10;
            i*=2;
        }
        System.out.println(n +" decimal conversion is "+bin);
    }
    public static void decimalToBinaty1(int n){
        int num=n,bin=0,i=1;
        while (num>0) {
            int rem=num%2;
            bin=rem*i+bin;
            num/=2;
            i=i*10;     
        }
        System.out.println(n +" binary conversion is "+bin);
    }
    public static void decimalToBinaty(int num){
        int n=num;
        String res="";
        while (num>0) {
            int rem=num%2;
            res=rem+res;
            num/=2;    
        }
        System.out.println(n+ " binary value is "+res);

    }
}
