package Collection;

import java.util.ArrayDeque;
//import java.util.Deque;
import java.util.PriorityQueue;

public class QueueExpample {

	public static void main(String[] args) {
		PriorityQueue<String> PQ = new PriorityQueue<String>();
		PQ.add("Ramesh");
		PQ.add("Ravi");
		PQ.add("Vijaya");
		PQ.add("Rani");
		
		System.out.println("The list of values="+PQ);
		
		System.out.println("The first element = "+PQ.peek()); //Find the first element
		
		System.out.println("The first element = "+PQ.poll()); //remove the first element
		
		System.out.println("Values are display as = "+PQ);
		
		System.out.println("===========================================================================");
		
     ArrayDeque<String> AD = new ArrayDeque<String>();
		
        AD.add("Ramesh");
        AD.add("Ravi");
        AD.add("Vijaya");
		System.out.println(AD);
		
		System.out.println(AD.peek());
		System.out.println(AD.peekFirst());
		System.out.println(AD.peekLast());
		
		System.out.println(AD.poll());
		System.out.println(AD.pollFirst());
		System.out.println(AD.pollLast());
		
		System.out.println(AD);
		

	}

}
