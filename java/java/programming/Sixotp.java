//import java.util.Scanner;
class SixOtp
{
	public static void main(String[] args)
	{
		//Scanner sc = new Scanner(System.in);
		int otp;
		for(; ;)
		{
		
			otp=(int)(Math.random()*900000);
			if(otp>=100000 && otp<=900000)
			{
				System.out.println(otp);
				break;
			}
		}
	}
}