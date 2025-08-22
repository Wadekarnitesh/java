public class SubsequenseOfArrayElement {
    public static void main(String[] args) {
        int a[] = {1,3,3,3,3,3,3,6,7,7,8};
        // longestRepeatingSubsequence(a);
        // smallestRepeatingSubsequence(a);
        int ref[]= new int[] {11,2,11,8,4,3,3,4,8,5,7,11,7,5};
        String lps = longestPalindromicSubsequence3(ref);
         System.out.println("Longest Palindromic Subsequence: " + lps);
        System.out.println("Length: " + lps.length());
    }
     
    public static String longestPalindromicSubsequence3(int[] ref) {
        int n = ref.length;
        String[] dp = new String[n];  // instead of just storing lengths, store subsequence strings

        for (int i = n - 1; i >= 0; i--) {
            dp[i] = String.valueOf(ref[i]); // single element palindrome
            String prev = "";  // will hold dp[i+1][j-1] equivalent

            for (int j = i + 1; j < n; j++) {
                String temp = dp[j]; // save current before overwriting

                if (ref[i] == ref[j]) {
                    dp[j] = ref[i] + prev + ref[j];
                } else {
                    dp[j] = (dp[j].length() > dp[j - 1].length()) ? dp[j] : dp[j - 1];
                }

                prev = temp; // update prev for next j
            }
        }

        return dp[n - 1];
    }  

     public static int longestPalindromicSubsequence2(int[] ref) {
        int n = ref.length;
        int[] dp = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            dp[i] = 1; // single element = palindrome of length 1
            int prev = 0;
            for (int j = i + 1; j < n; j++) {
                int temp = dp[j];
                if (ref[i] == ref[j]) {
                    dp[j] = 2 + prev;
                } else {
                    dp[j] = Math.max(dp[j], dp[j - 1]);
                }
                prev = temp;
            }
        }
        return dp[n - 1];
    }

   
     
    public static void longestPalindromicSubsequence(int[] ref)
	{
		int count=0,maxCount=0,index=0;
				
		for(int i=0;i<ref.length-1;i++)
		{
			count=0;
			int start=i,end=ref.length-1;
			
			for( ;start<end;end--)
			{	int st=start,ed=end;
				while(ref[st]!=ref[ed])
				{
					ed--;
				}
				end=ed-1;
				while(st<ed)
				{
					if(ref[st]==ref[ed])
					{
						count+=2;
						st++;
						ed--;
					}
					else
						break;
					
				}
				
				if(st==ed || st==ed+1)
				{
					
					if(count>maxCount)
					{
						if(st==ed)
							count++;
						
						maxCount=count;
						index=i;
					}
				}
				
			}
		}
		
		System.out.print("The longest palindromic subsequence is: [");
		for(int j=index;j<index+maxCount;j++)
		{
			System.out.print(ref[j]);
			if(j<index+maxCount-1)
				System.out.print(",");
		}
		System.out.print("] which starts at index "+index);
		
	}




    public static void sepratePositiveNegativeArrayElement(int[] a) {
        /** here it print negative on left positive right
         * 
         */
        int i = 0, j = a.length - 1;

        while (i < j) {
            while (i < j && a[i] < 0) {
                i++;
            }
            while (i < j && a[j] >= 0) {
                j--;
            }
            if (i < j) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }

        for (int k = 0; k < a.length; k++) {
            System.out.print(a[k] + " ");
        }
    }

    public static void smallestRepeatingSubsequence(int[] a) {
    int ct = 0, index = -1;
    int minCount = Integer.MAX_VALUE;
    int i = 0;

    for (; i < a.length - 1; i++) {
        if (a[i] == a[i + 1]) {
            ct++;
        } else {
            if (ct > 0 && ct < minCount) {
                minCount = ct;
                index = i;
            }
            ct = 0;
        }
    }
    if (ct > 0 && ct < minCount) {
        minCount = ct;
        index = i;
    }

    if (index != -1) {
        System.out.println("The smallest repeating subsequence is " + a[index] +
                           " repeated " + (minCount + 1) + " times");
    } else {
        System.out.println("No repeating subsequence found");
      }
   }

    public static void longestRepeatingSubsequence(int a[]){
        int ct = 0, index = 0, max = 0, i = 0;

        for (; i < a.length - 1; i++) {
            if (a[i] == a[i + 1]) {
                ct++;
            } else {
                if (ct > 0) {
                    if (max < ct) {
                        max = ct;
                        index = i;
                    }
                }
                ct = 0;        
            }
        }

        if (max < ct) {
            max = ct;
            index = i;
        }
        System.out.println("Longest subsequence is " + a[index] + " with length " + (max + 1));
    }
}
