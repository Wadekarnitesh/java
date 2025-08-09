import java.util.Scanner;
class Market
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("********Market City*************");
		System.out.println("------Main Menu------");
		System.out.println("1. Fruits");
		System.out.println("2. Vegetables");
		System.out.println("Choose the option:");
		int ans=sc.nextInt();
		
		switch(ans)
		{
			case 1:
			{
				System.out.println("------Fruits------");
				System.out.println("1. Apple");
				System.out.println("2. Banana");
				System.out.println("3. Pineapple");
				System.out.println("4. Custard Apple");
				System.out.println("5. Papaya");
				System.out.println("6. Watermelon");
				System.out.println("7. Mango");
				System.out.println("8. Orange");
				
				System.out.println("Enter the choice: ");
				int ip=sc.nextInt();
				
				switch(ip)
				{
					case 1:
					{
						System.out.println("** Apple ---> 50 RS. **");
						System.out.println("Enter the quantity: ");
						int op=sc.nextInt();
						int price=50*op;
						System.out.println("Total is: "+price);
						break;
					}
					case 2:
					{
						System.out.println("** Banana ---> 40 RS. **");
						System.out.println("Enter the quantity: ");
						int op=sc.nextInt();
						int price=40*op;
						System.out.println("Total is: "+price);
						break;
					}
					case 3:
					{
						System.out.println("** Pineapple ---> 60 RS. **");
						System.out.println("Enter the quantity: ");
						int op=sc.nextInt();
						int price=60*op;
						System.out.println("Total is: "+price);
						break;
					}
					case 4:
					{
						System.out.println("** Custard Apple ---> 65 RS. **");
						System.out.println("Enter the quantity: ");
						int op=sc.nextInt();
						int price=65*op;
						System.out.println("Total is: "+price);
						break;
					}
					case 5:
					{
						System.out.println("** Papaya ---> 30 RS. **");
						System.out.println("Enter the quantity: ");
						int op=sc.nextInt();
						int price=30*op;
						System.out.println("Total is: "+price);
						break;
					}
					case 6:
					{
						System.out.println("** Watermelon ---> 25 RS. **");
						System.out.println("Enter the quantity: ");
						int op=sc.nextInt();
						int price=25*op;
						System.out.println("Total is: "+price);
						break;
					}
					case 7:
					{
						System.out.println("** Mango ---> 70 RS. **");
						System.out.println("Enter the quantity: ");
						int op=sc.nextInt();
						int price=70*op;
						System.out.println("Total is: "+price);
						break;
					}
					case 8:
					{
						System.out.println("** Orange ---> 35 RS. **");
						System.out.println("Enter the quantity: ");
						int op=sc.nextInt();
						int price=35*op;
						System.out.println("Total is: "+price);
						break;
					}
					default:
					{
						System.out.println("Not another option is present their");
					}
				}
				break;
			}
			case 2:
			{
				System.out.println("------Vegetables------");
				System.out.println("1. Carrot");
				System.out.println("2. Broccoli");
				System.out.println("3. Spinach");
				System.out.println("4. Cucumber");
				System.out.println("5. Chilli");
				System.out.println("6. Brinjal");
				System.out.println("7. Tommato");
				System.out.println("8. Potato");
				
				System.out.println("Enter the choice: ");
				int ip=sc.nextInt();
				
				switch(ip)
				{
					case 1:
					{
						System.out.println("** Carrot ---> 30 RS. **");
						System.out.println("Enter the quantity: ");
						int op=sc.nextInt();
						int price=30*op;
						System.out.println("Total is: "+price);
						break;
					}
					case 2:
					{
						System.out.println("** Broccoli ---> 15 RS. **");
						System.out.println("Enter the quantity: ");
						int op=sc.nextInt();
						int price=15*op;
						System.out.println("Total is: "+price);
						break;
					}
					case 3:
					{
						System.out.println("** Spinach ---> 35 RS. **");
						System.out.println("Enter the quantity: ");
						int op=sc.nextInt();
						int price=35*op;
						System.out.println("Total is: "+price);
						break;
					}
					case 4:
					{
						System.out.println("** Cucumber ---> 40 RS. **");
						System.out.println("Enter the quantity: ");
						int op=sc.nextInt();
						int price=40*op;
						System.out.println("Total is: "+price);
						break;
					}
					case 5:
					{
						System.out.println("** Chilli ---> 15 RS. **");
						System.out.println("Enter the quantity: ");
						int op=sc.nextInt();
						int price=15*op;
						System.out.println("Total is: "+price);
						break;
					}
					case 6:
					{
						System.out.println("** Brinjal ---> 20 RS. **");
						System.out.println("Enter the quantity: ");
						int op=sc.nextInt();
						int price=20*op;
						System.out.println("Total is: "+price);
						break;
					}
					case 7:
					{
						System.out.println("** Tommato ---> 35 RS. **");
						System.out.println("Enter the quantity: ");
						int op=sc.nextInt();
						int price=35*op;
						System.out.println("Total is: "+price);
						break;
					}
					case 8:
					{
						System.out.println("** Potato ---> 40 RS. **");
						System.out.println("Enter the quantity: ");
						int op=sc.nextInt();
						int price=40*op;
						System.out.println("Total is: "+price);
						break;
					}
					default:
					{
						System.out.println("Not another option is present their");
					}
				}
			}
		}
	}
}	