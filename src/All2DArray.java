import java.util.Arrays;
public class All2DArray {
    public static void main(String []args){
        int a[][]={{1,2,3},{6,8,9},{3,2,5}};
        int b[][]={{1,5,6},{6,8,9},{3,2,5}};

        PrintArray(a);
        System.out.println();
        // System.out.println();
        // PrintArray(transposeArray(a));
        // System.out.println();
        // System.out.println();
        // PrintArray(reverseArray(a));
        // System.out.println(sumOfAllElement(a));
        // System.out.println(sumOftwoDiagonalElement(a));
        // PrintArray(productOfTwoArray(a, b));
        // PrintArray(sumOfTwoArray(a, b));
        PrintArray(rotate90Array(a));


    }
    public static int[][] rotate90Array(int [][]a){

        transposeArray(a);
        reverseArray(a);
        return a;

    }

    public static int [][] sumOfTwoArray(int [][]a,int b[][]){
        int ans[][]=new int [a.length][b[0].length];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b[i].length;j++){
                int sum=0;
                sum+=a[i][j]+b[i][j];
                ans[i][j]=sum;
            }
        }
        return ans;
    }



    public static int[][] productOfTwoArray(int [][]a,int [][]b){
        int ans[][]=multiply(a,b);
        return ans;
    }
    public static int[][]  multiply(int [][]a,int [][]b){
        if(a[0].length==b.length){
            int [][]c=new int [a.length][b[0].length];
            for(int i=0;i<a.length;i++){
                for(int j=0;j<b[i].length;j++){
                    int sum=0;
                    for(int k=0;k<b.length;k++){
                        sum+=a[i][k]*a[k][j];
                    }
                    c[i][j]=sum;
                }
            }
            return c;

        }
        return null;


    }

    public static int  sumOftwoDiagonalElement(int [][]a){
        int sum=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
               if( i+j==a.length-1  || i==j){
                 sum+=a[i][j];
               }
            }
        }
        return sum;
    }   

    public static int  sumOfAllElement(int [][]a){
        int sum=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                sum+=a[i][j];
            }
        }
        return sum;
    }    
    public static void PrintArray(int [][]a){
        for(int i=0;i<a.length;i++){
            System.out.println(Arrays.toString(a[i])+" ");
        }
    }
    public static int [][] transposeArray(int [][]a){
        
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                if(j>i){
                    int temp=a[i][j];
                    a[i][j]=a[j][i];
                    a[j][i]=temp;
                }   
            }
        }
        return a;
    }
    public static int[][] reverseArray(int [][]a){
        for(int i=0;i<a.length;i++){
            reverse(a[i]);
        }
        return a;
    }
    public static void reverse(int []a){
        for(int i=0,j=a.length-1;i<j;i++,j--){
            a[i]=a[i]+a[j];
            a[j]=a[i]-a[j];
            a[i]=a[i]-a[j];
        }
    }
    
}
