package Test;

public class LoopsExamples {

	public static void main(String[] args) 
	{
		//While Loop
		int num=1;
		while(num<=10)
		{
			if(num==5)
			{
				num=num+1;
				continue;
			}
			System.out.println(num);
			num=num+1;
		}
		//For loop
		for (int count=1;count<=10;count++)
		{
			if(count==5)
			{
				//continue;
				break;
			}
			System.out.println("The count the value="+count);
	}
		for (int count=10;count>=1;count--)
		{
			System.out.println("The count the value="+count);
		}
		
		//Arrays with loop
		int arr[]= {10,20,30,40,50};
		for(int index=0;index<arr.length;index++)
		{
			System.out.println("values inside arr="+arr[index]);
		}
		for(int value:arr)
		{
			System.out.println(value);
		}

	String[] name= {"abc","xyz","pqr"};
	for(String count:name)
	{
		System.out.println(count);
	}
	}
}
