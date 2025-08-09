

import java.util.Arrays;

public class InterSectionArray {
    public static int[] intersectionAr(int[]a,int[]b) {
       
        int ct=0;
         boolean []check=new boolean[b.length];
         for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(a[i]==b[j]){
                    ct++;
                    check[j]=true;
                }
            }
         }
         int ans[]=new int[ct];
         for(int i=0,j=0;i<ans.length;){
            if(check[j]){
                ans[i]=b[j];
                i++;j++;
            }
            else{
                j++;
            }
          }
          return ans;
        }
        
         public static void main(String []args){

            int a[]={3,5,7,8,9,45};
            int[]b={7,9,6,3};
            System.out.println(Arrays.toString(intersectionAr(a, b)));

         }
         
         
        
       
}
