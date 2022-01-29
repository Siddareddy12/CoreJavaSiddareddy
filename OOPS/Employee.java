package OOPS;

public class Employee 
{
	String name;
	int EmployeeID;
	public static int salary=10000;
	
	public Employee(String name,int EmployeeID,int salary)
	{
		this.name=name;
		this.EmployeeID=EmployeeID;
		this.salary=salary;
	}
	public Employee(String name,int EmployeeID)
	{
		this.name=name;
		this.EmployeeID=EmployeeID;
	}
	public void printname()
	{
		System.out.println("Name of the emplyee is="+name);
	}

	public static void printsary() {
		System.out.println("Name of the emplyee is="+Employee.salary);
		
	}
	
}
