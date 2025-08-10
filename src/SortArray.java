import java.util.Arrays;
public class SortArray {
    public static void main(String[] args) {
        int a[]={80,65,44,32,18,12,7,9,24};
        int b[]={4,7,8,9,2,94,6,78};
        // System.out.println(Arrays.toString(bubbleSortModified(a)));
        // System.out.println(Arrays.toString(bubbleSort(a)));
        System.out.println(Arrays.toString(mergeSort(a, b)));
    }

    public static int [] mergeSort(int []a,int[]b) {
        int i=0,j=0,k=0;

        bubbleSort(a);
        bubbleSort(b);
        int ans[]=new int[a.length+b.length];
        while(i<a.length&& j<b.length){
            if(a[i]>=b[j]){
                ans[k++]=b[j++];
            }
            else{
                ans[k++]=a[i++];
            }
        }
        while (i<a.length){
            ans[k++]=a[i++];
        }
        while (j<b.length){
            ans[k++]=b[j++];
            
        }
        return ans;
            
        }
        
    

    public static int[] bubbleSortModified(int []a){
        for (int i = 0; i < a.length-1; i++) {
            boolean check=false;
            for(int j=0;j<a.length-1-i;j++){
                if(a[j]>a[j+1]){
                    check =true;
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
            if(!check){
                break;
            }   
        }
        return a;
    }
    public static int[] bubbleSort(int []a){

        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-1-i;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        return a;
    }
    
}
