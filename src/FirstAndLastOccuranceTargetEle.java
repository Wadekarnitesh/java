public class FirstAndLastOccuranceTargetEle {
    public static void main(String[] args) {
        int []a={1,3,4,5,6,7,7,7,9};
        System.out.println("first occurance : "+occurance(a, 7, false));
        System.out.println("last occurance : "+occurance(a, 7, true));
        System.out.println("Count of occurance "+countOfOccurance(a,7));
        
    }
    public static int occurance(int []a,int ele,boolean flag){

        int start=0;
        
        int end=a.length-1;
        int res=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(a[mid]==ele){
                if(!flag){
                    end=mid-1;
                    res= mid;
                }
                else{
                    start=mid+1;
                    res= mid;
                }

            }
            else if(ele>a[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return res;
        
    }

    public static int countOfOccurance(int []a,int ele){
        int first = occurance(a, ele, false);
    int last = occurance(a, ele, true);
    if (first == -1 || last == -1) {
        return 0; 
    }
    
    return (last - first + 1);
    }
    
}
