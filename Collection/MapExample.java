package Collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) 
	{
		HashMap<Integer, String> HM=new HashMap<Integer, String>();
		HM.put(1,"Raghu");
		HM.put(2,"Ravi");
		HM.put(3,"Ramya");
		HM.put(4,"Sharadha");
		
		System.out.println("The Map value are = "+HM);
		
		HM.put(5,"Raju");
		HM.put(1,"Ramesha");
		
		System.out.println("After update the new value = "+HM);
		
		HM.put(1,"Ramesha");
		System.out.println("After update the new value = "+HM);
		
		HM.remove(2);
		System.out.println("After remove values are = "+HM);
		
		for(Map.Entry<Integer, String> entry1 : HM.entrySet())//Using for loop we facth the data
		{
			System.out.println("The values are getting through for each loop = "+entry1.getValue());
			System.out.println("The values are getting through for each loop = "+entry1.getKey());
		}
		
		for(Integer val : HM.keySet()) // Only display Key sets
		{
			System.out.println("Only display the Keyset = "+val);
			System.out.println("Getting values are = "+HM.get(val));
		}
		
		for(String val1 : HM.values()) // Only display Values sets
		{
			System.out.println("Only display the Keyset = "+val1);
		}
		
		
		//==============================================================
		System.out.println("=====================================================");
		LinkedHashMap<Integer, String> LHP=new LinkedHashMap<Integer, String>(); //Will store the sequence
		LHP.put(1,"Raghu");
		LHP.put(2,"Ravi");
		LHP.put(3,"Ramya");
		LHP.put(4,"Sharadha");
		
		System.out.println("The Linked list value are = "+LHP);
		
		System.out.println("=====================================================");
		TreeMap<Integer, String> TM=new TreeMap<Integer, String>();//Values are display asscending order
		TM.put(1,"Raghu");
		TM.put(2,"Ravi");
		TM.put(15,"Sidda");
		TM.put(3,"Ramya");
		TM.put(4,"Sharadha");
		
		System.out.println("The Linked list value are = "+TM);
		
		
		//Home work 
		
		String S="CLean India green india love india"; //Count the words using map
		
	}

}
