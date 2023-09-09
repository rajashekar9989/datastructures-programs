package examples;

public class SLL {

	Node head;

	int size;

	class Node {

		int data;
		Node next;

		Node(int data, Node next) {

			this.data = data;
			this.next = next;

			size++;

		}
	}

	int getSize() {

		return this.size;
	}

	void display() {

		Node temp = head;

		if (temp == null) {

			System.out.println("SLL is empty");
		}

		while (temp != null) {

			System.out.print(temp.data + "-->");

			temp = temp.next;
		}
		System.out.println("null");
	}

	void addFirst(int data) {

		Node nn = new Node(data, null);

		if (head == null) {

			head = nn;

			return;
		}

		nn.next = head;

		head = nn;
	}

	void addLast(int data) {

		Node nn = new Node(data, null);

		if (head == null) {

			head = nn;

			return;
		}

		Node temp = head;

		while (temp.next != null) {

			temp = temp.next;
		}
		temp.next = nn;

	}

	void addAtPosition(int data, int position) {

		int i = 0;

		Node nn = new Node(data, null);

		if (head == null) {

			head = nn;

			return;
		}

		if (position >= 0 && position <= getSize() - 1) {

			if (position == 0) {

				nn.next = head;

				head = nn;
			}

			else if (position == getSize() - 1) {

				Node temp = head;
				while (temp.next != null)

					temp = temp.next;
				temp.next = nn;
			}

			else {

				Node currNode = head;
				Node prevNode = null;

				while (currNode.next != null && i < position) {

					prevNode = currNode;

					currNode = currNode.next;

					i++;
				}

				prevNode.next = nn;

				nn.next = currNode;

			}
		}

		else {
			System.out.println("out of Range");
		}

	}

	void sortedInsertAsc(int data) {

		Node nn = new Node(data, null);

		Node temp = head;

		if (temp == null || temp.data > data) {

			nn.next = head;

			head = nn;

			return;
		}

		while (temp.next != null && temp.next.data < data) {

			temp = temp.next;

		}

		nn.next = temp.next;

		temp.next = nn;

	}

	void insertDesc(int data) {

		Node nn = new Node(data, null);

		Node temp = head;

		if (temp == null || temp.data < data) {

			nn.next = head;

			head = nn;

			return;

		}

		while (temp.next != null && temp.next.data > data) {

			temp = temp.next;

		}

		nn.next = temp.next;

		temp.next = nn;

	}

	void deleteAtFirst() {

		if (head == null) {

			System.out.println("SLL is empty");

			return;
		}

		size--;

		head = head.next;
	}

	void deleteAtLast() {

		if (head == null) {

			System.out.println("SLL is empty");

			return;
		}

		if (head.next == null) {

			head = null;
			size--;
			return;

		}

		size--;

		Node temp1 = head, temp2 = head.next;

		while (temp2.next != null) {

			temp2 = temp2.next;

			temp1 = temp1.next;

		}

		temp1.next = null;

	}

	void deleteAtPosition(int position) {

		int i = 0;

		if (position < 0 || position >= getSize()) {

			System.out.println("out of range");

			return;
		}
		if (head == null) {

			System.out.println("Sll is empty");
		}

		if (position == 0) {

			head = head.next;

			size--;

			return;
		}

		Node temp = head;

		while (temp.next != null && i < position) {

			if (i == position - 1) {

				temp.next = temp.next.next;
				size--;
				return;

			}

			i++;
			temp = temp.next;

		}

	}

	void deleteElement(int data) {

		Node temp = head;

		if (head == null) {

			System.out.println("Sll is empty");

			return;
		}

		if (temp.data == data) {

			head = head.next;
			size--;
			return;
		}

		while (temp.next != null) {

			if (temp.next.data == data) {

				temp.next = temp.next.next;
				size--;
				return;

			}

			temp = temp.next;

		}

	}

	void deletElements(int data) {

		Node temp = head;

		if (temp == null) {

			System.out.println("Sll is empty");

			return;
		}

		if (temp.data == data) {

			head = head.next;
			size--;

		}

		while (temp.next!= null) {

			if (temp.next.data == data) {

				temp.next = temp.next.next;
				size--;

			}
			
			if(temp.next!=null)  

			temp = temp.next;

		}

	}
	
	void removeDuplicate() {
		
		
		Node temp=head;
		
		while(temp!=null) {
			
			
			if( temp.next !=null && temp.data ==temp.next.data) {
				
				temp.next=temp.next.next;
			}
			
			else {
				
				temp=temp.next;
			}
		}
	}
	
	boolean search(int data) {
		
		Node temp =head;
		
		
		
		while(temp!=null) {
			
			if(temp.data == data) 
				
				return true;
				
			temp=temp.next;
			
		
		}
		return false;

}
	
	
	void reverse() {
		
		Node temp=head, next=null,prev=null;
		
		
		while(temp!=null) {
			
			next=temp.next;
			
			temp.next=prev;
			prev=temp;
			temp=next;
		}
		
		head=prev;
			
			
	}
	
	
	boolean compareList(Node head1,Node head2) {
		
		
		if(head1== null && head2 == null) 
			
			return true;
		
		
		else  if(head1== null || head2 == null || (head1.data !=head2.data))
			
			return false;
			
			
		
		
		else {
			
			return compareList(head1.next,head2.next);
			
		}
	}
}
