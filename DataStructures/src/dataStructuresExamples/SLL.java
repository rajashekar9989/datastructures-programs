package dataStructuresExamples;


// this class is single linked list implementation class

public class SLL {
	
	
	
	Node head;
	class Node{
		
		
		
		int data;
		
		Node next;
		
		
		Node(int data, Node next){
			
			this.data =data;
			
			this.next =next;
		}
		
		
		void display() {
			
			Node temp=head;
			
			if(temp==null) {
				
				System.out.println("SLL is Empty");
				
				return;
			}
			
			while(temp!=null) {
				
				System.out.println(temp.data);
				
				temp=temp.next;
			}
			
		}
		
		
	}

}
