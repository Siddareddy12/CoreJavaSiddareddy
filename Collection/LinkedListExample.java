package Collection;
import java.util.*;

//Main class
public class LinkedListExample {

 // Main driver method
 public static void main(String args[])
 {
     // Creating object of the
     // class linked list
     LinkedList<String> ll = new LinkedList<String>();

     // Adding elements to the linked list
     ll.add("A");
     ll.add("B");
     ll.addLast("C");
     ll.addFirst("D");
     ll.add(2, "E");

     System.out.println(ll);
     
     for(int index=0;index<ll.size();index++) //Display all values in Linked List
     {
    	 System.out.println("The display values are"+ll);
     }
 }
}
