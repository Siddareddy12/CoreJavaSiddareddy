package OOPS;

public class Parent {
	
	public String name;
	int age;
	
	public Parent()
	{
		System.out.println("Inside PArent default constructer");
	}
	public Parent(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public void display()
	{
		System.out.println("Inside parent");
	}

}
