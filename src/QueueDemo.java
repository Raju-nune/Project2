import java.util.*;
public class QueueDemo {
	    public static void main(String[] args)
	        throws IllegalStateException
	    {
	  
	        
	        Queue<Integer> Q = new LinkedList<Integer>();
	        Q.add(1000);
	        Q.add(2000);
	        Q.add(3000);
	        Q.add(4000);
	        Q.add(5000);
	        Q.add(6000);
	        System.out.println("Queue: " + Q);
	        System.out.println("Queue's head: " + Q.remove());
	        System.out.println("Queue's head: " + Q.remove());
	        System.out.println("Queue: " + Q);
	    }
}

		

