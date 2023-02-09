package fa.training.instance_method;

public class Animal {
	static int number;
	
	
	
	private void name() {
		System.out.println(number);
	}
	
	public static void name2() {
//		int number = 1;
//		System.out.println(number);
		System.out.println(number);
	}
	
	public final void name3() {
		System.out.println("Snake");
	}
	
	public synchronized void name4() {
		System.out.println(number);
	};
}
