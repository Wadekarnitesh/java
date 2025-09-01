
import com.sun.source.doctree.ReturnTree;
import java.util.*;

public class AllStringCode {
    public static void main(String[] args) {
        String s="I Love India";
        // readString(s);
        // System.out.println(countOfVowel(s));
        System.out.println(Arrays.toString(StringToCharArray(s)));
        System.out.println(Arrays.toString(StringToByteArray(s)));
        // System.out.println(stringUpperCase("jguifjkvgk5888=*)([1279hkhkig"));
        // System.out.println(stringLowerCase("jgHWKFWHIWHILNAKF80-8ACig"));
        // System.out.println(InStringToFoundNumber("kvgk5888=*)([1279hkh"));
        // System.out.println(reverseString(s));
        // System.out.println(facinatingNumber(" 987654321"));
        System.out.println(printSpecialChar("jfdjcjh@647478[]1`//,><)()*&*(&*((r75779222"));
        frequncyOfCharecter(s);
    }
    public static void frequncyOfCharecter(String s){
        for(int i=0;i<s.length();i++){
            int ct=0;
            for(int j=0;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    ct++;
                }
            }
            System.out.println("char :"+s.charAt(i)+"  frequncy:"+ct);
        }
    }
    public static String removeSpecialChar(String s){
        String res="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if ((c >= 'a' && c <= 'z') || 
            (c >= 'A' && c <= 'Z') || 
            (c >= '0' && c <= '9')) 
            {
                res+=c;
            }
        }
        return res;
    }

    public static String printSpecialChar(String s) {
    String res = "";
    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);

        // FIX: put '!' outside the whole condition
        if (!((c >= 'a' && c <= 'z') || 
              (c >= 'A' && c <= 'Z') || 
              (c >= '0' && c <= '9'))) 
        {
            res += c;
        }
    }
    return res;
}


    public static String facinatingNumber(String s){
        int i=1,j=0;
        for(;j<s.length();j++){
            if(s.charAt(j)==48+i){
                j=0;
                i++;
            }
        }
         if(i==j){
                return "Its facinating number" ;
        }else{
            return "not facinating num";
        }
    }

    public static String reverseString(String s){
        String res="";
        for(int i=s.length()-1;i>=0;i--){
            char c=s.charAt(i);
            res+=c;
        }
        return res;
    }

    public static int InStringToFoundNumber(String s){
        String res="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c>='0'&& c<='9'){
                res+=c;
            }
        }
        int i=Integer.parseInt(res);
        return i;
    }

    public static String stringLowerCase(String s){
        String res="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c>='a'&& c<='z' || c>='A'&& c<='Z'){
                if(c>='A'&& c<='Z'){
                    res+=(char)(c+32);
                }
                else{
                    res+=c;
                }
            }
            else{
                res+=c;
            }
        }
        return res;

    }

    public static String stringUpperCase(String s){
        String res="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c>='a'&& c<='z' || c>='A'&& c<='Z'){
                if(c>='a'&& c<='z'){
                    res+=(char)(c-32);
                }
                else{
                    res+=c;
                }
            }
            else{
                res+=c;
            }
        }
        return res;

    }

    public static byte[]  StringToByteArray(String s){
        byte[]b=new byte[s.length()];
        for(int i=0;i<b.length;i++){
            char c=s.charAt(i);
            b[i]=(byte)c;
        }
        return b;
    }


    public static char[] StringToCharArray(String s){
        char[]c=new char [s.length()];
        for(int i=0;i<c.length;i++){
            c[i]=s.charAt(i);
        }
        return c;
    }


    public static int countOfVowel(String s){
        int count=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='a'|| c=='A'|| c=='e'||c=='i'||c=='E'|| c=='I'||c=='o'|| c=='O'||c=='u'||c=='U'){
                count++;
            }
        }
        return count;
        
    }

    public static void readString(String s){
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            System.out.println(ch);
        
        }
    }
    
    
}
