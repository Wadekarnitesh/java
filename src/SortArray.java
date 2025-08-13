import java.util.Arrays;
public class SortArray {
    public static void main(String[] args) {
        int a[]={80,65,44,32,18,12,7,9,24};
        int b[]={4,7,8,9,2,94,6,78};
        // System.out.println(Arrays.toString(bubbleSortModified(a)));
        // System.out.println(Arrays.toString(bubbleSort(a)));
        // System.out.println(Arrays.toString(mergeSort(a, b)));
        // mergeSort2(a, 0, a.length-1);
        // quickSort(a, 0, a.length-1);
        System.out.println(Arrays.toString(a));
    }
    
    public static void quickSort(int[]a,int start,int end){
        if(start<end){
            int index=partision(a, start, end);
            quickSort(a, start, index-1);
            quickSort(a, index+1, end);
        }
    }
    public static int partision(int []a,int start,int end){
        int ref=a[start];
        int i=start,j=end;
        while(i<j){
            while(i<=end && a[i]<=ref){
                i++;
            }
            while(j>start&& a[j]>ref){
                j--;
            }
            if(i<j){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;

            }
            else{
                break;
            }
        }
        int temp=a[start];
        a[start]=a[j];
        a[j]=temp;
        return j;
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

       public static void mergeSort2(int []a,int start,int end){
    if(start<end){
        int mid=(start+end)/2;
        mergeSort2(a, start, mid);
        mergeSort2(a, mid+1, end);
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
    

