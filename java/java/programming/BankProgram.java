import java.util.*;
class BankProgram 
{
    static String name; //null
    static String email; //null 
    static String address; //null             
    static double bal; //0.0
    static int pin; //0
    static String contact; //0
    static long adhar; //0
    static String panCard; //null
    static long accountNumber = 1234_1234_1234L; 
    static String ifscCode = "LCF0009211";
	
	static ArrayList<String> statement = new ArrayList<String>();

    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        welcomeLoop:
        for (; ; ) 
		{
			System.out.println();
            System.out.println("  WELCOME  ");
            System.out.println("   LAXMI CHIT FUND");
			System.out.println();
            System.out.println("1. Create Account");
            System.out.println("2. Existing User");
			System.out.println();
            System.out.print("Enter your option: ");

            switch (sc.nextInt()) 
			{
                case 1: 
				{
					System.out.println();
                    System.out.println("CREATE ACCOUNT");
                    sc.nextLine();
                    System.out.print("Username: ");
                    name = sc.nextLine();
                    System.out.print("Email: ");
                    email = sc.next();
                    System.out.print("Address: ");
                    sc.nextLine();
                    address = sc.nextLine();
                    System.out.println("Aadhar Number: ");
                    adhar = sc.nextLong();
                    System.out.println("Pan Number: ");
                    panCard = sc.next();
                    System.out.print("Contact Number: ");
                    contact = sc.next();
                    System.out.println("Pin: ");
                    pin = sc.nextInt();
                    System.out.print("Enter an amount (Deposit): ");
                    bal = sc.nextDouble();
                    statement.add("Deposit: " + bal + "rs (Account Creation)");
					System.out.println();
                    System.out.println("ACCOUNT CREATED SUCCESSFULLY");
                    System.out.println();
					break;
                }

                case 2: 
				{
                    if (name == null) 
					{
						System.out.println();
                        System.out.println("CREATE YOUR ACCOUNT FIRST");
                        break;
                    }
					System.out.println();
                    System.out.println("LOGIN");
                    for (int i=3; i>=1; i--) 
					{
						System.out.println();
                        System.out.print("Username/Phone: ");
                        String cred1 = new Scanner(System.in).next();
                        System.out.print("Pin: ");
                        int cred2 = new Scanner(System.in).nextInt();
						System.out.println();
                        if ((cred1.equals(name) || cred1.equals(contact)) && cred2 == pin) 
						{
                            homePage:
                            for (; ; ) 
							{
								System.out.println();
                                System.out.println("HOME PAGE");
								System.out.println("");
                                System.out.println("1. Deposit Account");
                                System.out.println("2. Withdraw Account");
                                System.out.println("3. Check Balance");
                                System.out.println("4. Statement");
                                System.out.println("5. Loan");
                                System.out.println("6. Profile");
                                System.out.println("7. Logout");
								System.out.println();
                                System.out.print("Enter your option: ");
                                int opt = new Scanner(System.in).nextInt();
								System.out.println("");
                                switch (opt) 
								{
                                    case 1: 
									{
                                        System.out.println("Deposit Module");
										System.out.println();
                                        System.out.print("Enter your Amount: ");
                                        double depAmt = new Scanner(System.in).nextDouble();
                                        bal += depAmt; //balance updated
                                        System.out.println("Amount Deposited Successfully");
                                        statement.add("Deposit: " + depAmt + "rs");
                                        break;
                                    }

                                    case 2: {
                                        System.out.println("Withdraw Module");
										System.out.println();
                                        System.out.print("Enter your Amount: ");
                                        double withAmt = new Scanner(System.in).nextDouble();
										
										for(int k=3; k>=1; k--)  //put by own on thw time of understand by friend
										{
											System.out.print("Enter your Pin: ");
											int pin1 = new Scanner(System.in).nextInt();
											if (pin1 == pin) 
											{
												System.out.println();
												if (withAmt <= bal) 
												{
													bal -= withAmt;
													System.out.println("Amount Debited Successfully");
													statement.add("Withdraw: " + withAmt + "rs");
													continue homePage;
												} 
												else 
												{
													System.out.println("INSUFFICIENT FUNDS");
													continue homePage;
												}
											}
											else 
											{
                                                System.out.println("INVALID PIN");
                                                System.out.println("Attempt left: " + (k - 1));
                                            }
										}						
										System.out.println("It's Not Your Account");
                                        System.out.println("Account Blocked For 24 Hours");
                                        System.exit(0);
									}	
										
                                    case 3: {
                                        System.out.println("CHECK BALANCE MODULE");
                                        for (int j = 3; j >= 1; j--) 
										{
											System.out.println();
                                            System.out.print("Enter your pin: ");
                                            int pin1 = new Scanner(System.in).nextInt();
                                            if (pin == pin1) 
											{
                                                System.out.println("Your account balance is: " + bal);
                                                continue homePage;
                                            } 
											else 
											{
                                                System.out.println("INVALID PIN");
                                                System.out.println("Attempt left: " + (j - 1));
                                            }
                                        }
                                        System.out.println("It's Not Your Account");
                                        System.out.println("Account Blocked For 24 Hours");
                                        System.exit(0); //terminate the exec
                                        break;
                                    }

                                    case 4: 
									{
                                        System.out.println("Statement Module");
										System.out.println();
                                        for (String s : statement) 
										{
                                            System.out.println(s);
                                        }
                                        break;
                                    }

                                    case 5: 
									{
                                        System.out.println("Loan Module");
                                        break;
                                    }

                                    case 6: 
									{
                                        System.out.println("Profile Module");
                                        System.out.println("Username: " + name);
                                        break;
                                    }

                                    case 7: {
                                        System.out.println("THANK YOU VISIT AGAIN");
                                        System.exit(0); //terminate the exec
                                    }

                                    default: 
									{
                                        System.out.println("Invalid Option");
                                        break;
                                    }
                                }
                            }
                        } 
						else 
						{
                            System.out.println("Invalid Credentials");
                            System.out.println("Attempt left: " + (i - 1));
                        }
                    }

                    System.out.println("THANK YOU & NEVER VISIT AGAIN");
                    System.out.println("Your Account is Deactivated for 48 Hours");
                    System.exit(0); //terminate the exec
                }

                default: 
				{
                    System.out.println("Invalid Option");
                    break;
                }
            }
        }
    }
}
