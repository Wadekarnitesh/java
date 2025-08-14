public class AllNumberMethod{
    public static void main(String[] args) {
        // spyNumber(123);
        // neonNumber(9);
        // perfectNumber(28);
        // harshadNumber(81);
        // sunnyNumber(8);
        // perfectNumber(36);
        // strongNumber(145);
        // checkFirstEvenOdd(45);
        // armStrongNumber(153);
        // squareRoot(441);
        // xylemPholeunNumber(1234);
        // halfSplitNumber(789554);
        // techNumber(2025);
        // happyNmber(19);
        // automorphicNumber(5);
        // disariumNumber(175);
        // strontionNumber(1234);
    }
    public static void strontionNumber(int n){
        int num=n,count=0;
        while (num>0) {
            count++;
            num/=10; 
        }
        if(count==4){
            num=n;
            int mul=num*2;
            mul/=10;
            int tensDigit=mul%10;
            mul/=10;
            int hunderdDigit=mul%10;
            if(tensDigit==hunderdDigit){
                System.out.println("its strontion Number");
            }
            else{
                System.out.println("its not strontion Number");
            }
        }
        else{
                System.out.println("its not strontion Number");
        }
    }
    public static void disariumNumber(int n){
        int num=n,count=0;
        count=(int)Math.log10(n)+1;
        int sum=0;
        while (num>0) { 
            int lastDigit=num%10;
            sum+=Math.pow(lastDigit, count);
            count--;
            num/=10;
            
        }
        if(n==sum){
            System.out.println("its disarium Number");
        }
        else{
            System.out.println("its Not disariu mNumber");
        }

    }
    public static void automorphicNumber(int n){
        int num=n,count=0;
        while (num>0) {
            count++;
            num/=10;
        }
        int divide=1;
        for(int i=1;i<=count;i++){
            divide*=10;

        }
        num=n;
        int square=num*num;
        int last=square%divide;
        if(num==last){
            System.out.println("its automorphic Number");
        }
        else{
            System.out.println("its not automorphic Number");
        }

    }
    public static void happyNmber(int n){
        int num=n,sum=0;
        do { 
            sum=0;
         while (num>0){
            int last=num%10;
            sum+=last*last;
            num/=10;
        }
        num=sum;

        }while (sum>=10); 
        if(sum==1){
            System.out.println("its happy Number");
        }
        else{
            System.out.println("its not happy Number");
        }
        
    }
    public static void techNumber(int n){
        int num=n,count=0;
        while (num>0) {
            count++;
            num/=10;
        }
        if(count%2==0){
            int divisor=(int)Math.pow(10, count/2);
            int sum=(n/divisor)+(n%divisor);
            int squareOfSum=sum*sum;
            if(squareOfSum==n){
                System.out.println("its tech Number");
            }
            else{
                System.out.println("its not tech Number");
            }

        }
        else{
                System.out.println("its not tech Number");
        }


    }
    public static void halfSplitNumber(int n){
        int num=n,count=0;
        while (num>0) {
            count++;
            num/=10; 
            
        }
        if(count%2==0){
            int divisor=1;
            num=n;
            for(int i=0;i<count/2;i++){
                divisor*=10;
            }
            int rightHalf=num%divisor;
            int leftHalf=num/divisor;
            System.out.println(n+" left half is "+leftHalf);
            System.out.println(n+" right half is "+rightHalf);
        }
        else{
            System.out.println("number should always have even digit");
        }
    }
    public static void xylemPholeunNumber(int n){
        int num=n,outerDigit=0,innerDigit=0;
        while(num>0){
            int last=num%10;
            if(num==n|| num<10){
                outerDigit+=last;
            }
            else{
                innerDigit+=last;
            }
            num/=10;
        }
        if(outerDigit==innerDigit){
            System.out.println("its xylem Number");
        }
        else{
            System.out.println("its pholeum number");
        }
    }
    public static void squareRoot(int n){
        double ans=Math.sqrt(n);
        System.out.println("square root of "+n+" is "+ans);
    }
    public static void armStrongNumber(int n){
        int num=n,temp=n,count=0;
        while(num>0){
            count++;
            num/=10;
        }
        num=temp;
        int sum=0;
        while (num>0) {
            int last=num%10;
            int prod=1;
            for(int i=1;i<=count;i++){
                prod*=last;
            }
            sum+=prod;
            num/=10;
        }
        System.out.println();
        if(sum==temp){
            System.out.println("its armstrong Number");
        }
        else{
            System.out.println("its not armstrong Number");
        }
    }


    public static void evilNumber(int num){
        int n=num,count=0;
        numberConversion.decimalToBinaty(num);
        while(num>0){
            int last=num%10;
            if(last==2){
                count++;
            }
            num/=10;
        }
        if(count%2==0){
            System.out.println("Its evil number");
        }
        else{
            System.out.println("its not evil number.");
        }
    }



    public static void  checkFirstEvenOdd(int n){
        int num=n;
        while(num>10){
             num/=10;
        }
        if(num%2==0){
           System.out.println("first num is even");
        }
        else{
            System.out.println("first num is odd");
        }
    }
    public static void sunnyNumber(int n){
        int temp=n+1;
        boolean flag=false;
        for(int i=0;i<n/2;i++){
            if((i*i)==temp){
                flag=true;
                break;
            }
        }
        if(flag){
            System.out.println("Its is sunny Number.");
        }
        else{
            System.out.println("Its is Not sunny Number");
        }
    }
    public static void strongNumber(int n){
        int num=n,sum=0;
        while (num>0) {
            int last=num%10;
            int fact=1;
           for(int i=1;i<=last;i++){
            fact*=i;
           }
           sum+=fact;
           num/=10;  
        }
        // System.out.println(sum);
        if(sum==n){
            System.out.println(" Its Strong Number");
        }
        else{
            System.out.println("Its not a strong Number");
        }
    }
    public static void perfectSquare(int n){
        int num=n;
        boolean flag=false;
        for(int i=0;i<=num/2;i++){
            if((i*i)==num){
                flag=true;
                break;
            }
        }
        if(flag){
            System.out.println(" Is is perfect Square.");
        }
        else{
            System.out.println(" Its is Not perfect Square.");
        }
    }
    public static void harshadNumber(int n){
        int num=n,sum=0;
        while (num>0) {
            int rem=num%10;
            sum+=rem;
            num/=10; 
            
        }
        if(n!=0){
            if(n%sum==0){
                System.out.println("Number "+n+" is Harshad Number");
            }
            else{
                System.out.println(" Number "+n+" is not harshad Number");
            }
        }
        else{
            System.out.println("Number "+n+" is not harshad Number");
        }
    }
    public static void perfectNumber(int n){
        int num=n,den=1,sum=0;
        for(; den<=num/2;den++){
            if(num%den==0){
                sum+=den;
            }
        }
        if(sum==num){
            System.out.println("Number "+n+" is perfect Number");
        }
        else{
            System.out.println("Number "+n+" is not perfect Number");
        }
    }


    public static void neonNumber(int n2){
        int sum=0;
        int n=n2;
        int square=n*n;
        while((square)>0){
            sum+=(square)%10;
            square/=10;
        }
        if(sum==n){
            System.out.println("Number "+n2+" is neon Number");
        }
        else{
            System.out.println("Number "+n2+" is not neon Number");
        }
    }

    public static void spyNumber(int n){
        int n1=n;
        int sum=0,prod=1;
        for( ; n!=0;n/=10){
            sum+=(n%10);
            prod*=(n%10);
        }
        if(sum==prod){
            System.out.println("number:"+n1+" is spy number");
        }
        else{
            System.out.println("number:"+n1+" is not spy number");
        }
    }
    
}