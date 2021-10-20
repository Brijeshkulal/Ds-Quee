
public class QueeMain {
	public static void main(String[] args) {
		LinkedlistQuee quee = new LinkedlistQuee();
		quee.enqueu(56);
		quee.enqueu(30);
		quee.enqueu(70);
		quee.display();
		
		System.out.println("Removed element is " + quee.dequeue());
		quee.display();
		System.out.println("Removed element is " + quee.dequeue());
		quee.display();
	}

}
