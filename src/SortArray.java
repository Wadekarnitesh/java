import java.util.Arrays;
public class SortArray {
    public static void main(String[] args) {
        int a[]={80,65,44,32,18,12,7,9,24};
        // System.out.println(Arrays.toString(bubbleSortModified(a)));
        System.out.println(Arrays.toString(bubbleSort(a)));
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
