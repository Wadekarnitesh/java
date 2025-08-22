
public class InterviewQuestions {

public static void main(String[] args) {
    int a[]={3,3,6,3,9};
    int k=a.length/2;
    // System.out.println(k+"");
     int count=0;

    for(int i=0;i<a.length;i++){
       
        
        if(a[k]!=k){
            count++;
            a[k]=2;
        }
        else{
            break;
        }
         SortArray.bubbleSort(a);
    }
    System.out.println("tota number of operation require " +count);
    // Arrays.toSring(a);
    for(int c:a){
        System.out.print(c+" ,");
    }
}    
}
