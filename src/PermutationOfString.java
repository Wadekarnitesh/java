
import java.util.Arrays;

public class PermutationOfString {

    public static void main(String[] args) {
        String s="ABCD";
        permutationCreation(s.toCharArray(), 1);
        
    }
    public static void permutationCreation(char []a, int fix){
        
        if(fix==a.length){
            System.out.println(Arrays.toString(a));
        }
        for(int i=fix;i<a.length;i++){
            swap(a, fix, i);
            permutationCreation(a, fix+1);
            swap(a, i, fix);

        }

    }

    public static void swap(char[] a,int i,int j){
        char temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }

}
