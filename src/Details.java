import java.util.Scanner;
class Details
{
	String name;
	String add;
	int age;
	static long adharno=234709874567L;
	long personadhar;
	
	
	Details(){
	}
	
	Details(String name, String add, int age)
	{ 
		if(name.length()>= 2 && add.length()>=2 && age>=2){
			this.name=name;
			this.add=add;
			this.age=age;
			this.personadhar=++Details.adharno;
		}
		else{
			System.out.println("null");
		}
		
	}
	
	public void display()
	{
		System.out.println(adharno);
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name: ");
		String name = sc.nextLine();
		System.out.println("Enter add: ");
		String add = sc.nextLine();
		System.out.println("Enter age: ");
		int age = sc.nextInt();
		Details d= new Details(name, add, age);
		
	}
}