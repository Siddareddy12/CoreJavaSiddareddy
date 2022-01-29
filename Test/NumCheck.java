package Test;

import java.util.Scanner;

public class NumCheck 
{

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=scanner.nextInt();
		
		if(number%2==0)
		{
			System.out.println("The given number is even");
		}
		else
		{
			System.out.println("The given numner odd");
		}
		scanner.close();
	}

}
