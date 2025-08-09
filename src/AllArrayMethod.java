
import java.util.Arrays;
public class AllArrayMethod {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int a[]={10,20,30,40,50};
        int b[]={3,4,5,6};
        int o[]= new int[]{1,2,1,1,1,2,2,3};
        int p[]={6,7,8,7,6};
        System.out.println("array a: "+Arrays.toString(a));
        System.out.println("array b: "+Arrays.toString(b));
        System.out.println("array b: "+Arrays.toString(p));
        
        // System.out.println(Arrays.toString(mergeArray(a, b)));
       
        // System.out.println("second array revrse"+Arrays.toString(mergeSecondArrayReverse(a,b)));
        // System.out.println("its both array rev: "+Arrays.toString(reverseArrays(a, b)));
        // System.out.println("its first array rev: "+Arrays.toString(mergeFirstArrayReverse(a, b)));
        // System.out.println("Zig zag array: "+Arrays.toString(zigZagArray(a, b)));

        // System.out.println("array sum: "+arraySum(a));
        // System.out.println("reverse the array"+Arrays.toString(reverseArray(a)));
        // checkPalindromeArray(p);
        // evenElementArray(a);
        // oddElementArray(p);
      //  System.out.println(Arrays.toString(reverseUsingOneArray(a)));
       //   System.out.println(Arrays.toString(reverseUsingNoTempOneArray(a)));


        // System.out.println(Arrays.toString(rotateLeftArray(a)));
        // System.out.println(Arrays.toString(rotateLeftArrayNTimes(a, 2)));
        // System.out.println(Arrays.toString(rotateRightArray(a)));
        // System.out.println(Arrays.toString(rotateRightArrayNTimes(a, 2)));
        // System.out.println(elementFound(a, 20));
        // System.out.println(elementIndex(a, 20));
        // System.out.println(countOfElementArray(p,7));
        // System.out.println(findMaxElement(a));
        // System.out.println(Arrays.toString(insertElementFirst(a, 8)));
        // System.out.println(Arrays.toString(insertAtLast(a, 8)));
        // System.out.println(Arrays.toString(insertElementAtIndex(p, 2, 68)));
        // System.out.println(Arrays.toString(removeElmentFindIndex(a, 30)));
        // System.out.println(Arrays.toString(insertArrayATIndex(a, b, 2)));
        // System.out.println(Arrays.toString(removeElementStartToEnd(a, 1, 3)));
        // System.out.println(checkAllElementPresent(new int[]{3,5,3,2,6,4,3}, new int[]{5,2}));
       
        // System.out.println(Arrays.toString(removeDuplicateElement(o)));
        // System.out.println(Arrays.toString(removeDuplicateElement(p)));
        // System.out.println(Arrays.toString(checkFrequency(p))+"hii p");
        // System.out.println(Arrays.toString(checkFrequency(p))+"hii p");
        int[]u1={2,5,7,8,4};
        int u2[]={7,9,6,4,2};
        // System.out.println(Arrays.toString(intersectElementArrayUnique(b, p)));
        System.out.println(Arrays.toString(unionElementArrayUnique(u1, u2)));
        


    } public static int[] unionElementArrayUnique(int[]a,int[]b) {
       
        int ct=0;
         boolean []check=new boolean[b.length];
         for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(a[i]==b[j]){
                    ct++;
                    check[j]=true;
                }
            }
         }
         int ans[]=new int[(a.length+b.length)-ct];
         for(int i=0,j=0;i<ans.length;){
            if(i<a.length){
                ans[i]=a[i];
                i++;
            }
            else{
                if(!check[j]){
                ans[i]=b[j];
                i++;j++;
                }
                else{
                j++;
                }
            }
          }
          return ans;
        }
    
    
    public static int[] intersectElementArrayUnique(int[]a,int[]b) {
       
        int ct=0;
         boolean []check=new boolean[b.length];
         for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(a[i]==b[j]){
                    ct++;
                    check[j]=true;
                }
            }
         }
         int ans[]=new int[ct];
         for(int i=0,j=0;i<ans.length;){
            if(check[j]){
                ans[i]=b[j];
                i++;j++;
            }
            else{
                j++;
            }
          }
          return ans;
        }
    
    public static int[] checkFrequency(int []a){
        int ct[]=new int[a.length];
        for(int i=0;i<a.length;i++){
            if(ct[i]!=-1){
                int count=0;
                for(int j=i+1;j<a.length;j++){
                    if(a[i]==a[j]){
                         count++;
                        ct[j]=-1;     
                    }
                }
               ct[i]=count;
            }
        }
        return ct;
    }
    public static boolean checkAllElementPresent(int []a,int b[]){
        int j=0;
        for(;j<a.length;j++){
            for(int i=0;i<b.length;i++){
                if(b[i]==a[i]){
                    break;
                }
            }
             if(j>a.length){
                return true;
         }
        }
         return false;
    }

    public static int[] removeElementStartToEnd(int []a,int start,int end){
        if(start>=0&&end<a.length){
            int c[]=new int[a.length-(end-start)];
            for(int i=0;i<c.length;i++){
                if(i<start){
                    c[i]=a[i];
                }
                else{
                    c[i]=a[i+(end-start)];
                }

            }
            return c;
        }
        return a;
    }
    
    public static int[] insertArrayATIndex(int []a,int[]b,int index){
        if(index>=0&& index<a.length){
            int c[]=new int[a.length+b.length];
            for(int i=0,j=0;j<c.length;j++){
                if(j<index){
                    c[j]=a[j];
                }
                else if(i<b.length){
                    c[j]=b[i];
                    i++;
                }
                else{
                    c[j]=a[j-b.length];
                }
            }
            return c;
        }
        return a;
    }

    public static int[] removeElmentFindIndex(int[]a,int ele){
        int i=0;
        for(;i<a.length;i++){
            if(a[i]==ele){
                break;
            }
        }
        return removeIndexEle(a, i);
    }
    public static int [] removeIndexEle(int []a,int index){
        int b[]=new int[a.length-1];
        if(index>=0&&index<a.length){
            for(int i=0;i<a.length;i++){
                if(i<index){
                    b[i]=a[i];
                }
                else if(i>index){
                    b[i-1]=a[i];
                }
            }
            return b;
        }
        return a;
    }

    public static int[] insertElementAtIndex(int []a,int index,int ele){
        if(index>=0&& index<a.length){
            int b[]=new int [a.length+1];
            for(int i=0;i<b.length;i++){
                if(i<index){
                   b[i]=a[i];
                }
                 else if(i==index){
                   b[i]=ele;
                }
                else{
                   b[i]=a[i-1];
               }
            }
        return b;
        }
        return a;
    }
    public static int[] insertAtLast(int []a,int ele){
        int b[]=new int[a.length+1];
        b[b.length-1]=ele;
        for (int i = 0; i < b.length-1; i++) {
            b[i]=a[i];
        }
        return b;
    }
    public static int[] insertElementFirst(int []a,int ele){
        int b[]=new int[a.length+1];
        b[0]=ele;
        for(int i=1;i<b.length;i++){
            b[i]=a[i-1];
        }
        return b;
    }
  
    
      public static int secondMinElement(int[]a){
        int min=Integer.MAX_VALUE;
        int secMin=min;
        int i=0;
        while(i<a.length){
            if(a[i]<min){
                secMin=min;
                min=a[i];
            }
            else if(a[i]<secMin && a[i]!=min){
                secMin=a[i];
            }
        }
        return secMin;
    }


    public static int secondMaxElement(int []a){
        int max=Integer.MIN_VALUE;
        int secMax=max;
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                secMax=max;
                max=a[i];
            }
            else if(a[i]!=max && a[i]>secMax){
                secMax=a[i];
            }
        }
        return secMax;

    }
    public static int findMinElement(int []a){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        return min;
    }
    public static int findMaxElement(int []a){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        return max;
    }

    public static int countOfElementArray(int[]a,int ele){
        int count=0;
        int i=0;
         while(i<a.length){
            if(a[i]==ele){
                count++;
            }
            i++;
        }
        return count;
    }

    public static String elementIndex(int []a,int ele){
        int i=0;
        while(i<a.length){
            if(a[i]==ele){
                return "its index is- "+i;
            }
            i++;
        }
        return -1+" ";
    }
    public static String elementFound(int []a,int ele){
        int i=0;
        for(;i<a.length;i++){
            if(a[i]==ele){
                break;
            }
        }
        return i<=a.length?"Element found":"element not found";
    }


     public static int[] rotateRightArray(int []a){
        int temp=a[a.length-1];
        for(int i= a.length-1;i >0;i--) {
            a[i]=a[i-1];
        }
        a[0]=temp;
        return a;
    } 
     public static int[] rotateRightArrayNTimes(int []a,int n){
        for (int i = 0; i < n; i++) {
            rotateRightArray(a);
        }
        return a;
    }
    


    public static int[] rotateLeftArray(int []a){
        int temp=a[0];
        for(int i= 0;i < a.length-1;i++) {
            a[i]=a[i+1];
        }
        a[a.length-1]=temp;
        return a;
    } 
    public static int[] rotateLeftArrayNTimes(int []a,int n){
        for (int i = 0; i < n; i++) {
            rotateLeftArray(a);
        }
        return a;
    }
    
    public static int[] reverseUsingNoTempOneArray(int a[]){
         int i = 0;
        int j=a.length-1;
        for(; i < j; i++,j--) {
            a[i]=a[i]+a[j];
            a[j]=a[i]-a[j];
            a[i]=a[i]-a[j];
        }
        return a;

    }
    
    public static int[] reverseUsingOneArray(int a[]){
        int temp;
        int i = 0;
        int j=a.length-1;
        for(; i < j; i++,j--) {
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;
        }
        return a;
    }


    public static void oddElementArray(int a[]){
        for(int i=0;i<a.length;i++){
           if(a[i]%2!=0){
            System.out.print(" Element: "+a[i]+" - index: "+i);
            System.out.println();
           }
        }
    }

    public static void evenElementArray(int a[]){
        for(int i=0;i<a.length;i++){
           if(a[i]%2==0){
            System.out.print(" Element: "+a[i]+" - index: "+i);
            System.out.println();
           }
        }
    }


   public static void checkPalindromeArray(int[] a) {
        int i = 0;
        int j = a.length - 1;

        for (; i < j; i++, j--) {
            if (a[i] != a[j]) {
                break;
            }
        }
        if (i >= j) {
            System.out.println("It's a palindromic array");
        } else {
            System.out.println("It's not a palindromic array");
        }
    }

    


    public static int []  reverseArray(int []a){
        int c[]=new int [a.length];
        for(int i=0;i<a.length;i++){
            c[i]=a[a.length-1-i];
            
        }
        return c;
    }
    public static int arraySum(int[]a){
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        return sum;
    }

    public static int[] mergeArray(int[]a,int[]b){
        int c[]=new int[a.length+b.length];

        for(int i=0;i<c.length;i++){
            if(i<a.length){
                c[i]=a[i];
            }
            else{
                c[i]=b[i-a.length];
            }
        }
        return  c;
    }
    public static int[] mergeSecondArrayReverse(int[]a,int[]b){
        int c[]=new int[a.length+b.length];
        for(int i=0;i<c.length;i++){
            if(i<a.length){
                c[i]=a[i];
            }
            else{
                c[i]=b[c.length-i-1];
            }
        }
        return c;
    }
    public static int[] reverseArrays(int[]a,int[]b){
        int c[]=new int[a.length+b.length];
        for(int i=0;i<c.length;i++){
            if(i<a.length){
                c[i]=a[a.length-i-1];
            }
            else{
                c[i]=b[c.length-i-1];
            }
        }
        return c;
    }
    public static int[] mergeFirstArrayReverse(int[]a,int[]b){
        int c[]=new int[a.length+b.length];
        for(int i=0;i<c.length;i++){
            if(i<a.length){
                c[i]=a[a.length-i-1];
            }
            else{
                c[i]=b[i-a.length];
            }
        }
        return c;
    }

    public static int[] zigZagArray(int[]a,int []b){
        int c[]=new int[a.length+b.length];
        int i=0,j=0;
        while (j<c.length) {
            if(i<(a.length>b.length? b.length:a.length)){
                c[j++]=a[i];
                c[j++]=b[i];
                i++;
            }
            else{
                if(i<b.length){
                    c[j++]=b[i];
                    i++;
                }
                else{
                    c[j++]=a[i];
                    i++;
                }
            }
            
        }
        return c;
    }


    
}
