package OOPS;

public class RunnerClass 
{

	public static void main(String[] args) 
	{
		/*
		 * Employee emp=new Employee(); emp.name="Siddaredy"; emp.EmployeeID=2545;
		 * emp.salary=1000;
		 * 
		 * Employee emp2=new Employee(); emp2.name="Ramesh"; emp2.EmployeeID=25455;
		 * emp2.salary=10000;
		 * 
		 * System.out.println("The employee name="+emp.name);
		 * System.out.println("The employee2 name="+emp2.name);
		 */
		
		/*Employee emp=new Employee("Raghu",123,1500);
		Employee emp2=new Employee("Raghu1",1233,15000);
		Employee emp3=new Employee("Raghu2",1233);
		
		
		emp.printname();
		emp2.printname();
		Employee.printsary();*/
		Child C2=new Child("RAvi",30,"ATSE");
		//Parent P1=new Parent();
		Child C1=new Child();
		
		//C1.print();
		//C1.display();
		
		MethodOverloadingExample M=new MethodOverloadingExample();
		M.sum(10, 20);
		M.sum(10, 20,30);
		
		
		//BankExample E1=new BankExample();
		ICICBank I1=new ICICBank();
		I1.checkbalance();
		
		ChildInterface cint=new ChildInterface();
		cint.display();
		
		EncapsulationExample enc=new EncapsulationExample();
		enc.setName("Raghu");
		System.out.println(enc.getName());
		
		
	}

}
