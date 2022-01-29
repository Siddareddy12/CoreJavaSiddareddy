package OOPS;

public class Child extends Parent {
	
	String professional;
	public Child()
	{
		System.out.println("Inside child default constructer");
	}
	public Child(String name,int age,String professional)
	{
		super(name,age);
		this.professional=professional;
	}
	
	public void print()
	{
		super.display();
		System.out.println("Inside child");
	}

}
