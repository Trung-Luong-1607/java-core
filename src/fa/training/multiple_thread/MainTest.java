package fa.training.multiple_thread;

public class MainTest {
	public static void main(String[] args) {
//		Runnable p1 = new Person("A", 17, "Korea");
//		Runnable p2 = new Person("B", 16, "USA");
//		Runnable p3 = new Person("C", 18, "UK");
		
//		Thread t1 = new Thread(p1);
//		Thread t2 = new Thread(p2);
//		Thread t3 = new Thread(p3);
		
		Thread t1 = new Person("A", 17, "Korea");
		Thread t2 = new Person("B", 16, "USA");
		Thread t3 = new Person("C", 18, "UK");
		
//		t1.start();
//		t2.start();
//		t3.start();
		
		t1.run();
		t2.run();
		t3.run();
	}
}
