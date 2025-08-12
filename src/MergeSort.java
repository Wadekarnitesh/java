import java.util.Arrays;

public class MergeSort {
   public static void main(String[] args) {
    int a[]={11,4,5,7,4,2,6,9,3};
    // System.out.println(Arrays.toString(merge(a, 3, 4, 6)));
    mergeSort(a, 0,a.length-1);
    System.out.println(Arrays.toString(a));
    
   }
   public static void mergeSort(int []a,int start,int end){
    if(start<end){
        int mid=(start+end)/2;
        mergeSort(a, start, mid);
        mergeSort(a, mid+1, end);
        arrayMerge(a, start, mid, end);
    }
   }
    public static void arrayMerge(int[]a,int start,int mid,int end){
        int ans[]=new int[a.length];
        int i= start, j=mid+1,k=start;
        while(i<=mid && j<=end){

            if(a[i]>a[j]){
                ans[k++]=a[j++];
            }
            else if(a[i]<=a[j]){
                ans[k++]=a[i++];
            }
        }
        while (i<=mid) {
            ans[k++]=a[i++]; 
        }
        while (j<=end) {
            ans[k++]=a[j++]; 
            
        }
        for(int k2=start;k2<=end;k2++){
            a[k2]=ans[k2];
        }
    }
}
