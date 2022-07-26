
public class SingleLinkedList {

	    static Node head;
	    class Node 
	    {
	        int data;
	        Node next;
	        Node(int d)
	        {
	            data = d;
	            next = null;
	        }
	    }
	    void deleteKey(int key)
	    {
	        Node temp = head, prev = null;
	        while (temp != null && temp.data == key) 
	        {
	            head = temp.next;
	            temp = head; 
	        }
	        while (temp != null) 
	        {
	            while (temp != null && temp.data != key) 
	            {
	                prev = temp;
	                temp = temp.next;
	            }
	            if (temp == null)
	                return;
	            prev.next = temp.next;
	            temp = prev.next;
	        }
	    }
	  
	    public void push(int new_data)
	    {
	        Node new_node = new Node(new_data);
	        new_node.next = head;
	        head = new_node;
	    }
	    public void printList()
	    {
	        Node tnode = head;
	        while (tnode != null) 
	        {
	            System.out.print(tnode.data + " ");
	            tnode = tnode.next;
	        }
	    }
	  
	    public static void main(String[] args)
	    {
	        SingleLinkedList llist = new SingleLinkedList();
	        llist.push(7);
	        llist.push(2);
	        llist.push(3);
	        llist.push(2);
	        llist.push(8);
	        llist.push(1);
	        llist.push(2);
	        llist.push(2);
	        int key = 2; 
	        System.out.println("Created Single Linked list is:");
	        llist.printList();
	        llist.deleteKey(key);
	        System.out.println(
	            "\nSingle Linked List after Deletion is:");
	        llist.printList();
	    }
	}
	  


