package Test;

public class Voewls {

	public static void main(String[] args) 
	{
		String S1="Clean india green india";
		int count=0;
		for(int i=0;i<S1.length();i++)
		{
			char ch=S1.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				count++;
			}
			{
				
				System.out.println(count);
			}
			
		}
	}

}
