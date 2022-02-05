package Collection;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) 
	{
		Stack<String> str=new Stack<String>();
		str.push("Hello");
		str.push("Hi");
		str.push("Good");
		str.push("Nice");
		System.out.println("The value are display before using pop="+str);
		System.out.println("===============================================");
		str.pop(); //Remove the last element in the collection
		str.push("Thank you");
		System.out.println("The value are display after using pop="+str);
		
		System.out.println("The find the last element of stack=  "+str.peek());//Find the last element of collection
		
		System.out.println("The find the first element of collectio=="+str.firstElement());//Find the first element of collection
		
		

	}

}
