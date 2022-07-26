
public class TraverseLinkedList {
		static Node head;
		static class Node {
			
			int data;
			Node next, prev;
			
			Node(int d){
				data = d;
				next = prev = null;
			}
		}
		
		void reverse() {
			Node temp = null;
			Node current = head;
			
			while(current != null) {
				temp = current.prev;
				current.prev = current.next;
				current.next = temp;
				current = current.prev;
			}
			
			if(temp != null) {
				head = temp.prev;
			}
		}
		
		void push(int new_data) {
			Node new_node = new Node(new_data);
			new_node.prev = null;
			new_node.next = head;
			
			if(head != null) {
				head.prev = new_node;
			}
			head = new_node;
		}
		
		void printList(Node node) {
			while(node != null) {
				System.out.print(node.data + " ");
				node = node.next;
			}
		}
		
		public static void main(String[] args) {
			TraverseLinkedList tll = new TraverseLinkedList();
			
			tll.push(1001);
			tll.push(2002);
			tll.push(3003);
			tll.push(4004);
			tll.push(5005);
			System.out.println("Traversal in forward list ");
			tll.printList(head);	
			tll.reverse();
			System.out.println("\nTraversal in reverse list ");
			tll.printList(head);
		}

	}

