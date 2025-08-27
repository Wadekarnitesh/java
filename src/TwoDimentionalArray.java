import java.lang.reflect.Array;
import java.util.Arrays;

public class TwoDimentionalArray {
    public static void main(String[] args) {
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        // System.out.println(SumOfAllElement(a));
        // System.out.println(SumOfDiagonalElement(a));
        for(int i=0;i<a.length;i++){
            System.out.println(Arrays.toString(a[i]));
        }
        System.out.println(sumOfBorderElement(a));
        

    }
    public static int sumOfBorderElement(int[][]a){
        int sum=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                if(i==0||j==0||i==a.length-1||
                j==a.length-1){
                    sum+=a[i][j];
                }
            }
        }
        return sum;
    }
    
    public static int SumOfDiagonalElement(int [][]a){
         int sum=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                if(i==j || i+j==a.length-1){
                    sum+=a[i][j];
                }
            }
        }
        return sum;
    }

    public static int SumOfAllElement(int [][]a){
        int sum=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                sum+=a[i][j];
            }
        }
        return  sum;
    }
    
}
