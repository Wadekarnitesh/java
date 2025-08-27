public class User {
    String name;
    int age;
    char gen;
    long phno;
    String boarding;
    String dest;
    String email;

    public User(){

    }

    public User(String name, int age, char gen, long phno, String boarding, String dest, String email) {
        this.name = name;
        this.age = age;
        this.gen = gen;
        this.phno = phno;
        this.boarding = boarding;
        this.dest = dest;
        this.email = email;
    }
    
    public void displayUser(){
        System.out.println();
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Gender: "+gen);
        System.out.println("phone No: "+phno);
        System.out.println("Boarding point : "+boarding);
        System.out.println("Destination Point : "+dest);
        System.out.println("--------------------------------------------------------------------");
        System.out.println();
        
    }
    public String toString(){
        return "[Name:"+name+" ,Gen :"+gen+"]";
    }
    
}
