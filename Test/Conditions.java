package Test;

import java.util.Scanner;

public class Conditions
{

	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the age");
		int age=scanner.nextInt();
		
		if (age>=18)
		{
			System.out.println("Your are eligibale for voting");
		}
		else if(age==17)
		{
			System.out.println("Your not eligibale for votion try next year");
		}
		else
		{
			int eligibleyear=18-age;
			System.out.println("Your not eligibale for voting="+eligibleyear);
		}
		scanner.close();
	}

}
