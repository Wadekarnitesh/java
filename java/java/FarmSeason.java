import java.util.Scanner;
class FarmSeason
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("---------Seasonwise Crop----------");
		System.out.println("Select any season from below");
		System.out.println("1. Summer");
		System.out.println("2. Monsoon");
		System.out.println("3. Winter");
		
		System.out.println("The crop related to given season: ");
		int crop=sc.nextInt();
		
		switch(crop)
		{
			case 1:
			{
				System.out.println("Seasonal Vegetables");
				System.out.println("Bitter Gourds");
				System.out.println("Cucumbers");
				System.out.println("Watermelon");
			}
			
			case 2:
			{
				System.out.println("Rice");
				System.out.println("Maize");
				System.out.println("Jowar");
				System.out.println("Cotton");
				System.out.println("Bajra");
				System.out.println("Mung");
				System.out.println("Tur");
				break;
			}
			
			case 3:
			{
				System.out.println("Wheat");
				System.out.println("Barley");
				System.out.println("Gram (chana)");
				System.out.println("Mustard");
				System.out.println("Peas");
				break;
			}
			
			default:
				System.out.println("No such season is their");
				
		}
	}
}