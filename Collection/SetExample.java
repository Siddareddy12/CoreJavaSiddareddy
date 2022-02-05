package Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		
		HashSet<String> HS=new HashSet<String>();
		HS.add("Ranjita");
		HS.add("Ranjita1");
		HS.add("Ranjita2");
		HS.add("Ranjita3");
		HS.add(null);
		System.out.println("The value are = "+HS);
		
		System.out.println("=================================");
		
		LinkedHashSet<String> LS=new LinkedHashSet<String>();
		LS.add("Ranjita");
		LS.add("Ranjita1");
		LS.add("Ranjita2");
		LS.add("Ranjita3");
		LS.add(null);
		System.out.println("The value are = "+LS);
		
		System.out.println("=================================");
		
		TreeSet<String> TS=new TreeSet<String>();
		TS.add("Ranjita");
		TS.add("Ranjita1");
		TS.add("Ranjita2");
		TS.add("Ranjita3");
		//TS.add(null); //Tree set not allwoed null values
		System.out.println("The value are = "+TS);
		
		
		
		//IMP Home work
		
		String str="Clean world green world"; //remove duplicates 
		//Store like Clean world green
		HashSet<String> hs=new HashSet<String>();
		/*public static void main(String[] args) {
	        // How to remove duplicate word from string
	        String str1 = "Clean World Green World";
	        HashSet<String> hs1 = new HashSet<String>();
	        for (String word : str1.split(" ")) {
	            hs1.add(word);
	        }
	        System.out.println(hs1);
	    }*/
				

	}

}
