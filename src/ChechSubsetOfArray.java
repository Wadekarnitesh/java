
public class ChechSubsetOfArray  {
    public static boolean checkSubsetArr(int[]a,int[]b) {
        int ct2=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(a[i]==b[j]){
                    ct2++;
                }
            }
        }
        if(ct2==b.length){
            return true;
        }
        else{
            return false;
        }
       
    }
         public static void main(String []args){

            int a[]={3,5,7,8,9,45};
            int[]b={7,9,45};
            // System.out.println(Arrays.toString(intersectionAr(a, b)));
            System.out.println(checkSubsetArr(a, b));

         }
         
         
        
       
}
