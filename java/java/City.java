import java.util.Scanner;
class City
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("************MAHARASHTRA***************");
		System.out.println("Cities & their famous places");
		System.out.println("1. Pune");
		System.out.println("2. Mumbai");
		System.out.println("3. Aurangabad");
		System.out.println("4. Mahabaleshwar");
		System.out.println("5. Shirdi");
		System.out.println("6. Nashik");
		
		System.out.println("Choose the one option to find the famous places of the city: ");
		int city=sc.nextInt();
		
		switch(city)
		{
			case 1:
			{
				System.out.println("a. Dagdusheth Halwai Ganapati Temple");
				System.out.println("b. Shanivar Wada");
				System.out.println("c. Aga Khan Palace");
				System.out.println("d. Sinhagad Fort");
				System.out.println("e. Sarasbaug");
				System.out.println("f. Laal Mahaal");
				System.out.println("g. Khadakwasla Dam");
				System.out.println("h. Rajiv Gandhi Zoological Park and Wildlife Research Center");
				System.out.println("i. Torna Fort");
				System.out.println("j. Ramdara");
				System.out.println("k. ISKCON Temple");
				System.out.println("l. Swami Narayan Temple Katraj");
				break;
			}
			
			case 2:
			{
				System.out.println("a. Siddhivinayak Temple");
				System.out.println("b. Gateway of India");
				System.out.println("c. Marine Drive");
				System.out.println("d. Elephanta Cave");
				System.out.println("e. Chhatrapati Shivaji Maharaj Vastu Sangrahalaya");
				System.out.println("f. Sanjay Gandhi National Park");
				System.out.println("g. Shri Mahalakshmi Devi Temple");
				System.out.println("h. Bandra Worli Sea Link Bridge");
				System.out.println("i. Kamala Nehru Park");
				System.out.println("j. Chhatrapati Shivaji Maharaj Terminus");
				break;
			}
			
			case 3:
			{
				System.out.println("a. Shree Bhadra Maruti Temple");
				System.out.println("b. Ajanta Caves");
				System.out.println("c. Ellora Caves");
				System.out.println("d. Bibi Ka Maqbara");
				System.out.println("e. Daulatabad Fort");
				System.out.println("f. Chhatrapati Shivaji Maharaj Museum");
				System.out.println("g. Lonar Lake");
				System.out.println("h. Panchakki");
				break;
			}
			
			case 4:
			{
				System.out.println("a. Shri Panchganga Mandir");
				System.out.println("b. Mahabaleshwar Temple");
				System.out.println("c. Mahabaleshwar Hill Station");
				System.out.println("d. Sunrise point");
				System.out.println("e. Tiger Spring Point");
				System.out.println("f. Rajpuri Caves");
				System.out.println("g. Mumbai Sunset Point");
				System.out.println("h. Castle Rock Point");
				break;
			}
			
			case 5:
			{
				System.out.println("a. Shri Sai Baba Temple");
				System.out.println("b. Wet'n Joy Water Park");
				break;
			}
			
			case 6:
			{
				System.out.println("a. Trimbakeshwar Jyotirling Temple");
				System.out.println("b. Kumbh Mela (held every 12 years)");
				System.out.println("c. Sita Gufa");
				System.out.println("d. Ramkund");
				System.out.println("e. Panchavati");
				System.out.println("f. Shri Kapaleshwar Mahadev Mandir");
				System.out.println("g. Pandav Leni (Buddhist caves)");
				System.out.println("h. Gangapur Dam");
				break;
			}
			default:
				System.out.println("No Such City and Place is present");
		}
	}
}