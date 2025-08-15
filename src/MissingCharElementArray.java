public class MissingCharElementArray{
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,24,25,26};
        // System.out.println(missingCharEle(a));
        // missingCharEle(a);
        System.out.println(missinChar(a));
        
    }
    public static void missingCharEle(int a[]){
        int i=1;
       
        for(;i<26;i++){
             int count=0;
            for(int j=0;j<a.length;j++){
                if(i==a[j]){
                    count++;
                }
            }
            if(count==0){
                // return (char)(64+i);
                
                System.out.println(i);
                System.out.println((char)(64+i));
                break;
            }
        }
        // return (char)(64+i);
    }

    public static char   missinChar(int[]a){
      int ans[]= AllArrayMethod.removeDuplicate(a);
      int sum=0;
      for(int c : ans){
        sum+=c;
      }
      return (char)((26 * (26 + 1) / 2) - sum + 64);

      
    }
}