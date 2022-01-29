package Test;

public class ArrayExample {

	public static void main(String[] args) 
	{
		int[] num= {10,20,30,40,50};
		System.out.println("Total number of array"+num.length);
		System.out.println("value for third position="+num[3]);
		System.out.println("Values for last postion="+num[num.length-1]);
		
		String[] name= {"abc","xyz","pqr"};
		System.out.println("Value 2nd postion="+name[2]);
		
		String name1="Clear india green india love india";
		
		String[] arrwords=name1.split(" ");
		System.out.println("VAlue of 3rd postion="+arrwords[3]);
		System.out.println("Total value of words="+arrwords.length);
		
//		System.out.println("VAlue of 3rd postion="+name[1]);
//		System.out.println("Total value of words="+name.length);
		
		
		
		
		
		
		

	}

}
