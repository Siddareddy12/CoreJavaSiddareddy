package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
//import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) 
	{
		ArrayList<String> Arr = new ArrayList<String>(); //Declare array list syntax
		Arr.add("Ravi"); //Index start with 0
		Arr.add("Ramesh"); // index 1
		Arr.add("Raju"); //index 2
		Arr.add("Raghu"); //index 3
		Arr.add("Ramya");//index 4
		
		System.out.println("The display contents of array="+Arr.size()); // find the size of value before removing
		System.out.println("The display contents of array="+Arr);
		Arr.remove(1); //Remove index value of 1
		
		System.out.println("============================================");
		
		System.out.println("The display contents of array="+Arr.size()); //After remove the value in collection size of collection
		System.out.println("The display contents of array="+Arr);

		System.out.println("============================================");
		
		System.out.println("Get specified index value="+Arr.get(3)); //Find the specified index value in collection
		
		for(int index=0;index<Arr.size();index++) //Declare value of index
		{
			System.out.println("Display collection data=="+Arr.get(index)); //Display using Iteration display all data using for loop
		}
		for(String name : Arr) //Using for for each loop feacth all value in Array list collectionn
		{
			System.out.println("Display names using array list collection= "+name);
		}
		System.out.println("End ==================End");
		Iterator<String> itr=Arr.iterator(); // Using iterator arraylist collection values are display
		{
			while(itr.hasNext())
			{
				System.out.println("The display value="+itr.next());
			}
			
			Arr.set(3, "Rajani");  //Replace value specified index using set method
			System.out.println("After relace value="+Arr);
		}
		
		/*for(int index=0;index>Arr.size()-1;index--) //Declare value of index with reverse
		{
			System.out.println("Display collection data=="+Arr.get(index)); //Display using Iteration display all data using for loop
		}*/
		System.out.println("============================================");
		Collections.sort(Arr); //Sort values
		System.out.println("The sorting value"+Arr);
		
		Collections.sort(Arr,Collections.reverseOrder()); //Reverse sorting order
		System.out.println("The value are reverse order"+Arr);
		System.out.println("==============================================");
		Collections.reverse(Arr); //Reverse the order without sorting
		System.out.println("The reverse collection"+Arr);
		
	}

}
