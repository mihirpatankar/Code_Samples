package my_own_linklist;

public class Test {

	public static void main(String[] args) {
		System.out.println("Linked List Test");
		linkList llobject = new linkList();
		llobject.printLinkedList();
		llobject.appendNode(4);
		llobject.appendNode(1);
		llobject.appendNode(2);
		llobject.appendNode(3);
		llobject.prependNode(0);
		llobject.insertAtPosition(55, 0);
		llobject.printLinkedList();
		
	}

}
