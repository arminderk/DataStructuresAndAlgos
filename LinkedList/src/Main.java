
public class Main {
	public static void main(String[] args) {
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(2);
		
		LinkedList l = new LinkedList();
		l.insertAtHead(n1);
		l.insertAtHead(n2);
		l.insertAtHead(n3);
		l.print();
		l.removeDups();
		l.print();
	}
}
