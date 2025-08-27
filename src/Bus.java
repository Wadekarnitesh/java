
import java.util.Arrays;
import java.util.Scanner;

public class Bus {
    String name;
    String no;
    String start;
    String end;
    String type;
    String seatType;
    String startTime;
    String endTime;
    int dist;
    String [] boarding;
    String [] drop;
    
    User[][] seats=new User[10][4];

    public Bus() {
    }

    public Bus(String name, String no, String start, String end, String type, String seatType, String startTime, String endTime, int dist, String[] boarding, String[] drop) {
        this.name = name;
        this.no = no;
        this.start = start;
        this.end = end;
        this.type = type;
        this.seatType = seatType;
        this.startTime = startTime;
        this.endTime = endTime;
        this.dist = dist;
        this.boarding = boarding;
        this.drop=drop;
        
        System.out.println("Bus Registered!!");
    }
    
    public void showSeats(){
        System.out.println("-----------------------------------------------------------------");
        for(int i=0;i<seats.length;i++){
            for(int j=0;j<seats[i].length;j+=2){
                System.out.print(seats[i][j]+","+seats[i][j+1]+"  ");
            }
            System.out.println();
        }
        System.out.println("---------------------------------------------------------------------");
    }
    public void displayBus(){
        System.out.println();
        System.out.println("Name: "+name);
        System.out.println("Route: "+start+" to "+end);
        System.out.println("Boarding points: "+Arrays.toString(boarding));
        System.out.println("Drop off Points: "+Arrays.toString(drop));
        System.out.println("Bus No : "+no);
        System.out.println("----------------------------------------------------------------------");
    }
    public void bookSeat(String name,int age,char gen,long phno,
    String boarding ,String dest,String email,char row,int seatNo,int noOfSeats){

        showSeats();
        int i=row-65;
        int j=seatNo-1;
        if(noOfSeats==1){

            if(row>='A'&& row<='J'&& seatNo>0&& seatNo<=4){
                if(seats[i][j]==null){
                    if(j%2==0&& seats[i][j+1]==null  || j%2!=0&&seats[i][j-1]==null){
                        if(checkStartPoint(boarding)&& checkDropPoint(dest)){
                            reserveSeats(i,j,name,age,gen,phno,boarding,dest,email);
                        }
                        else{
                            System.out.println("Invalid Start and end Point");
                        }
                    }
                    else if(j%2==0&& seats[i][j+1].gen==gen || j%2!=0&&seats[i][j-1].gen==gen){
                        if(checkStartPoint(boarding)&& checkDropPoint(dest)){
                            reserveSeats(i,j,name,age,gen,phno,boarding,dest,email);
                        }
                        else{
                            System.out.println("Invalid Start and end Point ");
                        }
                    }
                    else{
                        if(gen=='M'){
                            System.out.println("This seat reserved for female!");
                        }
                        else{
                            System.out.println("This seat is reserved for male! ");
                        }
                    }
                }
                else{
                    System.out.println("Seat Already booked!");
                }
            }
            else{
                System.out.println("Invalid seat No!");
            }
        }
        else if (noOfSeats>1 && noOfSeats<=2) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a second Travellers details : ");
            System.out.println("Enter the Name: ");
            String name2=sc.nextLine();
            System.out.println("Enter the Age : ");
            int age2 =sc.nextInt();
            
            System.out.println("Enter a phone number : ");
            long phno2=sc.nextLong();

            System.out.println("Enter the Gender : ");
            char gen2=sc.next().charAt(0);

            System.out.println("Enter a email Id : ");
            String email2=sc.nextLine();

            System.out.println("Enter the row : ");
            char row2=sc.next().charAt(0);

            System.out.println("Enter a seat no : ");
            int seatNo2=sc.nextInt();

            if((row2>'A'&& row2<'J')&& seatNo2>0&&seatNo2<=4){
                int i2=row-65;
                int j2=seatNo2-1;
                if((i==i2 && j%2==0 && j2==j+1 && seats[i][j]==null && 
                seats [i2][j2]==null) ||(i==i2 && j%2!=0 && j2==j-1&& 
                seats[i][j-1]==null && seats [i2][j2]==null)){
                    if(checkStartPoint(boarding)&&checkDropPoint(dest)){
                         reserveSeats(i,j,name,age,gen,phno,boarding,dest,email);
                          reserveSeats(i2,j2,name2,age2,gen2,phno2,boarding,dest,email2);
                    }
                    else{
                        System.out.println("Invalid Staring and Ending Point ");
                    }
                }
                else if(j%2==0 && seats[i][j+1]==null || j%2!=0 && seats[i][j-1]==null){
                     if(checkStartPoint(boarding)&&checkDropPoint(dest)){
                        seats[i][j]=new User(name,age,gen,phno,
                        boarding,dest,email);
                        System.out.println(name+" Seat is Booked!");

                        if(j2%2==0&& seats[i2][j2+1]==null || j2%2!=0&& seats[i2][j2-1]==null){
                            reserveSeats(i2,j2,name2,age2,gen2,phno2,boarding,dest,email2);
                        }
                     }
                    
                }else if(j%2==0&& seats[i][j+1].gen==gen || j%2!=0&& seats[i][j-1].gen==gen){
                   if(checkStartPoint(boarding)&&checkDropPoint(dest)){
                        reserveSeats(i,j,name,age,gen,phno,boarding,dest,email);
                         if(j2%2==0 && seats[i2][j2+1]==null || j2%2!=0 && seats[i2][j2-1]==null){
                            
                          reserveSeats(i2,j2,name2,age2,gen2,phno2,boarding,dest,email2);
                         }
                         else if((j2%2==0 && seats[i2][j2+1]!=null && seats[i2][j2+1].gen==gen )|| (j2%2!=0 && seats[i2][j2-1]!=null && seats[i2][j2-1].gen==gen)){
                            reserveSeats(i2,j2,name2,age2,gen2,phno2,boarding,dest,email2);

                         }
                         else{
                            if(gen=='M'){
                                System.out.println(name2+" seat not be booked!");
                                System.out.println("Seat is reserved for female");
                            }
                            else{
                                System.out.println(name2+" seat not be booked!");
                                System.out.println("Seat is reserved for male");
                            }
                         }
                   } 
                   else{
                    System.out.println("Invalid start and end point ");
                   }
                }
                else{
                    if(gen=='M'){
                                System.out.println(name+" seat not be booked!");
                                System.out.println("Seat is reserved for female");
                            }
                            else{
                                System.out.println(name+" seat not be booked!");
                                System.out.println("Seat is reserved for male");
                            }
                }

            }
         }
         
    }
    public boolean checkStartPoint(String boarding1){
        for(int i=0;i<this. boarding.length ;i++){
            if(this. boarding[i].equals(boarding1)){
                return true;
            }
        }
        return false;
    }
    public boolean checkDropPoint(String drop1){
        for(int i=0;i<this.drop.length ;i++){
            if(this.drop[i].equals(drop1)){
                return true;
            }     
        }
        return false;
    }
    private void reserveSeats(int row,int column,String name,int age,char gen,long phno,
    String  boarding,String dest,String email){
        
        seats[row][column]=new User(name, age, gen, phno, boarding, dest, email);
        System.out.println(name+" seat Booked successfully");

    }

    public String toString(){
        return "[Name:"+name+",Bus Number:"+no+",Strating Point:"+boarding+",Destination:"+end+"]";
    }
    public boolean equals(Object o){
        return this.no.equals(((Bus)o).no);
    }
    public int hashCode(){
        return no.hashCode();
    }
    
        

    
}
