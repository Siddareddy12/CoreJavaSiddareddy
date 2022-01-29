package Test;

public class PrimeNumber 
{

	public static void main(String[] args) 
	{
		int no=10;
		boolean flag=false;
		for(int i=2;i<no;i++)
		
			if(no%i==0)
			{
				flag = true;
				break;
			}
			if(flag==false)
			{
				System.out.println("It is prime number");
			}
			else
			{
				System.out.println("It is not primenumber");
			}
		}

		
/*int num = 41;
boolean flag = true;

for(int index=2;index<num/2;index++) {
	
	int remainder = num%index;
	if(remainder == 0) {
		flag = false;
		break;
	}
}

if(flag == true) {
	System.out.println("The num is prime");
}else {
	System.out.println("The num is not prime");
}*/

}

	


