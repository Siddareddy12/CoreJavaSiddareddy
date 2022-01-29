package Test;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the String");
		String S1=scanner.nextLine();
		int voewlcount=0;
		for(int index=0;index<S1.length();index++)
		{
			char temp=S1.charAt(index);
			switch(temp)
			{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				voewlcount=voewlcount+1;
				break;
			/*
			 * default: System.out.println("Inside default");
			 */	
			
			}
		}
		System.out.println("Total count voewl="+voewlcount);
		
		{
			
		}
		scanner.close();
	}
	

	}

