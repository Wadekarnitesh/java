public class CompressString {

    public static void main(String[] args) {
        String s="aaaahhhjjjjjlll";
        System.out.println(compressString(s));
        
    }
    public static String compressString(String s){
        String ans="";
        int ct=1;
        for(int i=0,j=i+1;i<s.length();){
            if(j<s.length()&& s.charAt(i)==s.charAt(j)){
                ct++;
                j++;
            }else{
                ans=ans+s.charAt(i);
                ans=ans+ct;
                i=j;
                ct=1;
                j=i+1;
            }

        }
        return ans;
    }
    
    
}
