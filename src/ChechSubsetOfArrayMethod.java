public class ChechSubsetOfArrayMethod {

    public static void main(String[] args) {
        int a[]={6,8,9,5,3};
        int b[]={9,3};
        System.err.println(checkSubsetOfArray(a, b));
    }
    public static String checkSubsetOfArray(int []a,int b[]){
       for(int i=0;i<b.length;i++){
         int ele=b[i];
        
         if(!searchElement(a, ele)){
            return "it not a subset";
         }
       }
       return "its b is subset of a";
    }
    public static boolean searchElement(int []a, int ele){
    for(int i=0;i<a.length;i++){
        if(a[i]==ele){
            return true ;
        }
    }
    return false;
    }
    
}
