public class LongestPalindromicSubsequnce {

    public static void main(String[] args) {
        String s="Madam";
        System.out.println(longestPalindrome(s));
    }

    public static String  longestPalindrome(String s){
        String ans="",temp="";
        int maxCt=0;
        for (int i = 0; i < s.length()-3; i++) {
            int ct=0,j,k;
            temp="";
            if(s.charAt(i)==s.charAt(i+1)|| s.charAt(i)==s.charAt(i+2)){
                if(s.charAt(i)==s.charAt(i+1)){
                    j=i;k=i+1;
                    ct=2;
                }
                else{
                    j=i;
                    k=i+1;
                    temp+=s.charAt(i+1);
                    ct=3;
                }

                while(s.charAt(j)==s.charAt(k)){
                    temp=s.charAt(j)+temp+s.charAt(k);
                    ct+=2;
                    j--;
                    k++;
                }
                if(ct>maxCt){
                    ans=temp;
                    maxCt=ct;
                }
            }
            
        }
        return ans;

    }
    
}
