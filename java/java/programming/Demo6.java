
import java.util.*;
public class Demo6 {

    
    public static void main(String[] args) {
        System.out.println("+++++++++++++++welcom to calculator +++++++++++++++++++++++");
        System.out.println();
        System.out.println(" 1. Addition");
        System.out.println( "2. substction");
        System.out.println(" 3. multiplication");

        System.out.println("enter your choise");
        Scanner sc=new Scanner(System.in);


        switch (sc.nextInt()) {
            case 1: {
                System.out.println("enetr first num:");
                int i=sc.nextInt();
                System.out.println("enter scond num:");
                int i2=sc.nextInt();

                System.out.println("additon is : "+(i+i2));
                break;
            }
            case 2: {
                System.out.println("enetr first num:");
                int i=sc.nextInt();
                System.out.println("enter scond num:");
                int i2=sc.nextInt();

                System.out.println("additon is : "+(i-i2));
                break;
            }
            case 3: {
                System.out.println("enetr first num:");
                int i=sc.nextInt();
                System.out.println("enter scond num:");
                int i2=sc.nextInt();

                System.out.println("additon is : "+(i*i2));
                break;
            }
                
          
            default:{
                break;
            }
                
        }
        
    }
    
}
