import java.util.Scanner;
class HotelBilling
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("--------------Welcome to Taza Hotel--------------");
		System.out.println("Select the option below:");
		System.out.println("1. Veg");
		System.out.println("2. Non-Veg");
		int op=sc.nextInt();
		
		switch(op)
		{
			case 1:
			{
				System.out.println("---------Veg Menu------------");
				System.out.println("1. Poha ------> 20.0");
				System.out.println("2. Upma ------> 20.0");
				System.out.println("3. Vada Pav ------> 15.0");
				System.out.println("4. Idli ------> 30.0");
				System.out.println("5. Misal Pav ------> 50.0");
				System.out.println("Enter your Option: ");
				int ip=sc.nextInt();
				
				switch(ip)
				{
					case 1:
					case 2:
					{
						System.out.println("Enter the number of plates: ");
						int no=sc.nextInt();
						int total=20*no;
						System.out.println("Total Bills: "+total);
						break;
					}
					case 3:
					{
						System.out.println("Enter the number of plates: ");
						int no=sc.nextInt();
						int total=15*no;
						System.out.println("Total Bills: "+total);
						break;
					}
					case 4:
					{
						System.out.println("Enter the number of plates: ");
						int no=sc.nextInt();
						int total=30*no;
						System.out.println("Total Bills: "+total);
						break;
					}
					case 5:
					{
						System.out.println("Enter the number of plates: ");
						int no=sc.nextInt();
						int total=50*no;
						System.out.println("Total Bills: "+total);
						break;
					}
					default:
					{
						System.out.println("There are only 5 options");
					}
				}
				break;

			}
			case 2:
			{
				System.out.println("---------Non-Veg Menu------------");
				System.out.println("1. Chicken Biryani ------> 200.0");
				System.out.println("2. Chicken Lollipop ------> 180.0");
				System.out.println("3. Mutton Biryani ------> 400.0");
				System.out.println("4. Fish Fry ------> 400.0");
				System.out.println("5. Prawns  ------> 600.0");
				System.out.println("Enter your Option: ");
				int ip=sc.nextInt();
				
				switch(ip)
				{
					case 1:
					{
						System.out.println("Enter the number of plates: ");
						int no=sc.nextInt();
						int total=200*no;
						System.out.println("Total Bills: "+total);
						break;
					}
					case 2:
					{
						System.out.println("Enter the number of plates: ");
						int no=sc.nextInt();
						int total=180*no;
						System.out.println("Total Bills: "+total);
						break;
					}
					case 3:
					case 4:
					{
						System.out.println("Enter the number of plates: ");
						int no=sc.nextInt();
						int total=400*no;
						System.out.println("Total Bills: "+total);
						break;
					}
					case 5:
					{
						System.out.println("Enter the number of plates: ");
						int no=sc.nextInt();
						int total=600*no;
						System.out.println("Total Bills: "+total);
						break;
					}
					default:
					{
						System.out.println("There are only 5 options");
					}
				}
			}
		}
	}
}