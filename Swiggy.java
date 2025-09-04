import java.util.Scanner;
class  Swiggy
{
	static Scanner sc=new Scanner (System.in);
	public static void main(String[] args) throws Exception
	{
		System.out.println("\t\t\tWelcome to swiggy application:");
		System.out.println("\t\t\t-------------------------------");
		System.out.println("Select the hotel:");
		System.out.println("1.Buhari\n2.A2B\n3.Bilal\n4.Amma Canteen\n");
		System.out.print("enter no:");
		int hotel_selection=sc.nextInt();
	    System.out.println("processing.......");
		Thread.sleep(2000);
        switch(hotel_selection)
		{
			case 1:
			{
				System.out.println("\t\t\t\twelcome from Buhari");
				System.out.println("\t\t\t\t-------------------------");
				System.out.println("select Buhari menu:");
				System.out.println("------------------------");
				System.out.print("1.Mutton biriyani\n2.Chicken biriyani\n3.Chicken 65\n select fav one:");
				int food=sc.nextInt();
				System.out.println("processing.......");
		        Thread.sleep(2000);
				switch(food)
				{
					case 1:
					{
						int price=380;
						System.out.print("enter the MB qnty:");
						int qnty=sc.nextInt();
						int bill=price*qnty;
						System.out.println("enter your bill:"+bill);
						System.out.println("select the payment mode:");
						System.out.println("1.Phone_pay\n2.G_pay\n select one from this:");
						int pay_mode=sc.nextInt();
						System.out.println("processing.......");
		                Thread.sleep(2000);
						switch(pay_mode)
						{
							case 1:
							{
								System.out.println("Redirecting to phone pay");
								System.out.print("enter bill amount:");
								int bill_amount=sc.nextInt();
								if(bill==bill_amount)
								{
									System.out.println("your bill amount is correct");
									int sys_otp=(int)(Math.random()*999+999);
									System.out.print("enter ur otp:");
									System.out.println(sys_otp);
									int user_otp=sc.nextInt();
									String res=(sys_otp==user_otp)?"order placed delivery by next year":"otp wrong order fail";
									System.out.println(res);
							    }
								else
								{
									System.out.println("order fail");
								}
								
								break;
							}
							case 2:
							{
								System.out.println("Redirecting to g pay");
								System.out.println("enter bill amount:");
								int bill_amount=sc.nextInt();
								if(bill==bill_amount)
								{
									System.out.println("your bill amount is correct");
									int otp_gen=(int)(Math.random()*999+999);
									System.out.print("enter ur otp:");
									int user_otp=sc.nextInt();
									String res=(otp_gen==user_otp)?"order placed delivery by next year":"otp wrong order fail";
									System.out.println(res);
							    }
								else
								{
									System.out.println("order fail");
								}
								break;
							}
							default:
							{
								System.out.println("invalid payment");
								break;
							}
						}
					    break;
					}
					case 2: 
					{
						break;
					}
					case 3:
					{
						break;
					}
					default:
					{
						break;
					}
					
				}
				
				
				
				break;
			}
			case 2:
			{
				break;
			}
			case 3:
			{
				break;
			}
			default:
			{
				break;
			}
		}
	}
}
