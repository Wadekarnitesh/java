public class AllNumberPatttern {
    public static void main(String[] args) {
        p3(5);
    }
    

    public static void p3(int n){
//  10 11 12 13 14 
// 15 16 17 18 19
// 20 21 22 23 24
// 25 26 27 28 29
// 30 31 32 33 34

        int num=10;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print((num++)+" ");
            }
            System.out.println();
        }
    }
    public static void p2(int n){
// 0 0 0 0 0 
// 1 1 1 1 1
// 2 2 2 2 2
// 3 3 3 3 3
// 4 4 4 4 4


        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void p1(int n){

// 1 2 3 4 5 
// 1 2 3 4 5
// 1 2 3 4 5
// 1 2 3 4 5
// 1 2 3 4 5
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    
}
