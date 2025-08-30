public class AllPatternCode {
     public static void main(String[] args) {
     t11(6);   
    }


    public static void t12(int n){
        
        
    }
    public static void t11(int n){
//  *
//  * *
//  * * *
//  * * * *
//  * * *
//  * *
//  *
        int star=1;
        for(int i=0;i<=n;i++){
            for(int j=0;j<star;j++){
                System.out.print(" *");

            }
            System.out.println();
            if(i<n/2){
                star++;  
            }
            else{
                star--;
            }
        }
    }
    public static void t10(int n){

//                 * 
//              *  *  *
//           *  *  *  *  *
//        *  *  *  *  *  *  *
//     *  *  *  *  *  *  *  *  *
//  *  *  *  *  *  *  *  *  *  *  *
//     *  *  *  *  *  *  *  *  *
//        *  *  *  *  *  *  *
//           *  *  *  *  *
//              *  *  *
//                 *
        //uppere half
        for (int i = 1; i <= n; i++) {
            for (int space = i; space < n; space++) {
                System.out.print("   ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        // lower half
        for (int i = n - 1; i >= 1; i--) {
            for (int space = n; space > i; space--) {
                System.out.print("   ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void t9(int n){
        //pascal triangle
//       * 
//      * *
//     * * *
//    * * * *
//   * * * * *
//  * * * * * *
        
        for (int i = 0; i < n; i++) {
            // spaces for alignment
            for (int space = 0; space < n - i; space++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    
    }


    public static void t8(int n){
    //  * * * * * * * * *
    //     * * * * * * *
    //       * * * * *
    //         * * *
    //           *
        for(int i=0;i<n;i++){
            for(int space=0;space<i;space++){
                System.out.print("  ");
            }
            for(int star=0;star<=(2*(n-1-i));star++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public static void t7(int n){
//     *
//    ***
//   *****
//  *******
// *********

        for(int i=0;i<n;i++){
            for(int space=0;space<(n-1-i);space++){
                System.out.print("  ");
            }
            for(int star=0;star<i*2-1;star++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public static void t6(int n){
      
//   * * * * * * * *
//     * * * * * * *
//       * * * * * *
//         * * * * *
//           * * * *
//             * * *
//               * *
//                 *
         for(int i=0;i<n;i++){
            for(int space=0;space<i;space++){
                System.out.print("  ");
            }
            for(int star =0;star<n-i;star++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }


   public static void t5(int n){
// * * * * * * * * * 
//   * * * * * * * * 
//     * * * * * * * 
//       * * * * * * 
//         * * * * * 
//           * * * * 
//             * * * 
//               * * 
//                 *
      for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j<i){
                    System.out.print("  ");
                }
                else{
                    System.out.print("* ");
                }
            }
             System.out.println();
        }
   }
   
    public static void t4(int n){


//                 * 
//               * *
//             * * *
//           * * * *
//         * * * * *
//       * * * * * *
//     * * * * * * * 
//   * * * * * * * *
// * * * * * * * * *
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j<(n-1-i)){
                    System.out.print("  ");
                }
                else{
                    System.out.print("* ");
                }
            }
             System.out.println();
        }
    }
    
    public static void t3(int n){

//                 * 
//               * *
//             * * *
//           * * * *
//         * * * * *
//       * * * * * *
//     * * * * * * *
//   * * * * * * * *
// * * * * * * * * *
        for(int i=0;i<n;i++){
            for(int space=0;space<n-1-i;space++){
                System.out.print("  ");
            }
            for(int star =0;star<=i;star++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    public static void t1(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void t2(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

   
}
