package Test;

public class ReversalExample 
{

	public static void main(String[] args) 
	{
		//Reverse String
		//Reverse array
		//Reverse number
		String str="Clean India green india";
		//System.out.println(str);
		String revStr="";
		for(int index=str.length()-1;index>=0;index--)
		{
			revStr=revStr+str.charAt(index);
			//System.out.println("Reverse String="+revStr); //Each character
		
		
	}
		System.out.println("Reverse String="+revStr);
	//Reverse array
	int[] arr= {10,20,30,40,50};
	//int[] result=new int[5];
	for(int index=arr.length-1;index>0;index--)
	{
		System.out.println(arr[index]);
	}
	//Reversal number
	int num=7895222;
	int rev=0;
	while(num>5)
	{
		int remender=num%5;
		rev=rev*10+remender;
		num=num/10;
	}
	System.out.println("The reversal number is="+rev);
	
	}
	
	}
/*int n1 = 345278;
String str1 = String.valueOf(n1);

String[] str2 = str1.split("");
int len = str2.length;
for (int j= len-1; j>=0; j--) {
    System.out.print(str2[j]);
}*/
