package Test;

public class DataType 
{

	public static void main(String[] args) 
	{
		int num=10;
		int num1=20;
		int sum=num+num1;
		int sub=num-num1;
		int mul=num*num1;
		float div=(float)num/num1;
		String result = "The sum nu and num result="+sum;
		String result1 = "The sum nu and num1 result="+sub;
		String result2 = "The sum nu and num2 result="+mul;
		String result3 = "The sum nu and num3 result="+div;
		
		
		System.out.println(result);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
		String name="Claen india green India";
		System.out.println("The num of characted in name=" +name.length());
		
		char char1=name.charAt(1);
		char char2=name.charAt(name.length()-1);
		
		System.out.println("The last character="+char2);
		System.out.println("Char as second place="+char1);
		
		System.out.println("The upper case display name=" +name.toUpperCase());
		
		System.out.println("The lower case display name=" +name.toLowerCase());
		
		
	}

}
