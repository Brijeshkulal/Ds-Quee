
public class LinkedlistQuee {
	Node head;
	Node tail;
	int size;
	
	public void enqueu(int data) {
		Node node = new Node(data);
		if(head == null) {
			head = node;
			tail = node;
			}
		else {
			tail.next = node;
			tail = node;
			size++;
		}
	}
	
	public int dequeue() {
		if(head == null) {
			System.out.println("Quee is empty");
		}
		int result = head.data;
		head = head.next;
		size--;
		return result;
	}
	
	public void display()
	{
		Node temp = head;
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
}
