package Test;

public class ExceptionHandle 
{

	public static void main(String[] args) 
	{
		int no=10;
		int[] arr= {10,20,30,40,50};
				try
		{
					int result=no/0;
					System.out.println("Arra result"+arr[10]);
					System.out.println("The result="+result);
		}
				catch(ArithmeticException  e1)
				{
					System.out.println("Inside Arithmetic Exeption");
				}
		catch (Exception e) 
		{
			System.out.println("Inside catch");
		}
				finally
				{
					System.out.println("Aways excecated code");
				}
		System.out.println("After try and catch block");

	}

}
