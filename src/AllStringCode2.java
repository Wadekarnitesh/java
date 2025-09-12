import java.util.*;
public class AllStringCode2 {

    public static void main(String[] args) {
        String s="i love india";
        System.out.println(charArraySort(s.toCharArray()));
        
    }


    public static char[]  charArraySort(char[] c){
        int[] b=new int [c.length];
        for(int i=0;i<c.length;i++){
            b[i]=(int)c[i];
        }

        for(int i=0;i<b.length;i++){
            for(int j=0;j<b.length-i-1;j++){
                if(b[j]>b[j+1]){
                    int temp=b[j+1];
                    b[j+1]=b[j];
                    b[j]=temp;
                }
            }
        }
        char []c2=new char[b.length];
        for(int i=0;i<c2.length;i++){
            c2[i]=(char)b[i];
        }
        return c2;
    }


    public static void  isPanagram(String s){

        char []c=s.toCharArray();
        



    }


    public static boolean isAnagram(String s1,String s2){
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        char c1[]=s1.toCharArray();
        char c2[]=s2.toCharArray();
        Arrays.sort(c2);
        Arrays.sort(c1);

        
        for(int i=0;i<c1.length;i++){
            if(c1[i]!=c2[i]){
                return false;
            }
        }
        return true;
    }
    
}
