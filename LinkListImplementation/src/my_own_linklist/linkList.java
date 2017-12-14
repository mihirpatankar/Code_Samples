package my_own_linklist;

public class linkList {
	Node head;
	int size;
	public linkList() {
		head=null;
	}
	
	public void insertAtPosition(int data, int position) {
		Node temp = new Node(data);
		if(position==1) {
			temp.next=head;
			head=temp;
			return;
		}
		if(position>size+1 || position < 1) {
			System.out.println("Invalid position !");
			return;
		}
		Node start=head;
		for(int i=0;i<position-2;i++) {
			start=start.next;
		}
		temp.next=start.next;
		start.next=temp;
	}
	public void appendNode(int data) {
		size++;
		Node temp = new Node(data);
		if(head==null) {
			head=temp;
			return;
		}
		Node start = head;
		while(start.next!=null) {
			start=start.next;
		}
		start.next=temp;
	}
	
	public void prependNode(int data) {
		size++;
		Node temp = new Node(data);
		if(head==null) {
			head=temp;
			return;
		}
		temp.next=head;
		head=temp;
	}
	
	public void printLinkedList() {
		if(head==null) {
			System.out.println("Linked List Empty !");
			return;
		}
		Node start = head;
		System.out.print(start.val);
		System.out.print(" --> ");
		while(start.next!=null) {
			start=start.next;
			System.out.print(start.val);
			System.out.print(" --> ");
		}
		System.out.println(" NULL ");
		
	}
}
