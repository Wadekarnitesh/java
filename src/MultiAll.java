public class MultiAll {
    public static void main(String[] args) {
        int a[]={5,8,2,4};
        int index=2;
        int mul=1;
        for(int i=0;i<a.length;i++){
            if(i<index){
                mul*=a[i];
            }else if(i>index){
                mul*=a[i];
            }      
        }
        System.out.println(mul);

    }   
}
