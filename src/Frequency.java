
class Frequency{
    public static void main(String[] args) {
        int num=232435;
        int temp=num;
        int carry=num;
        while(num!=0){
            int last=num%10;
            int count =0;
            temp=carry;
            while(temp!=0){
                if(last==temp%10){
                    count++;
                }
                temp/=10;
            }
            System.out.println(last +" "+count);
            num/=10;


        }
    }
}