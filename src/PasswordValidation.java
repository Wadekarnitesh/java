
import java.util.Scanner;



public class PasswordValidation {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc=new Scanner(System.in);
        int storePin=145;
        int millisec=2000;
        outerLoop:
        for( ; ;){
            int attempt=3;
            do { 
                System.out.println();
                System.out.println(" Enter your pin: ");
                int newPin=sc.nextInt();
                if(newPin==storePin){
                    System.out.println("Phone is Unlocked.");
                    break outerLoop;
                }
                else{
                    System.out.println("Invalid Pin...");
                    System.out.println("Attemp left :-"+(attempt-1));
                }
                attempt--;

                
            } while (attempt>=1);

            System.out.println("");
            System.out.println("Phone is disable for "+(millisec/1000)+" second");
            Thread.sleep(millisec);
            millisec*=2;
        }
        
    }    
}
