package modulus;

import java.util.Scanner;

public class ModChallenges
	{

		public static void main(String[] args)
			{
				showChallenge1();
				
				try
					{
						Thread.sleep(1000);
					} catch (InterruptedException e)
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
				showChallenge2();
				

				try
					{
						Thread.sleep(1000);
					} catch (InterruptedException e)
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
				
				showChallenge3();
			}

		private static void showChallenge1()
			{
				Scanner userInput = new Scanner(System.in);
				System.out.println("Choose a number and I will tell you if its even or odd");
				int number = userInput.nextInt();
				
				if (number % 2 ==0)
					{
						System.out.println(number + " is even");
					}
				else
					{
						System.out.println(number + " is odd");
					}
			}

		private static void showChallenge2()
			{
				Scanner userInput = new Scanner(System.in);
				System.out.println("Choose a year and I will tell you if that year is a leap year");
				int year = userInput.nextInt();
				
				if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
					{
						System.out.println("That is a leap year");
					}
				else
					{
						System.out.println("That is not a leap year");
					}
			}

		private static void showChallenge3()
			{
				for(int i = 1; i < 101; i++)
					{
						
						if(i % 3 == 0 && i % 5 != 0)
							{
								System.out.println("Fizz");
							}
						
						else if(i % 5 == 0 && i % 3 != 0)
							{
								System.out.println("Buzz");
							}
						
						else if(i % 5 == 0 && i % 3 == 0)
							{
								System.out.println("FizzBuzz");
							}
						
						else
							{
								System.out.println(i);
							}
					}
				
			}

	}
