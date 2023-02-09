package fa.training.boxing;

public class AutoBoxingTest {
	public static void main(String[] args) {
		// Autoboxing
		int a = 1;
		Integer b = a;
		System.out.println(b);
		
		// Unboxing
		Integer c = new Integer(15);
		int d = (int) c;
		System.out.println(d);
		
		Integer e = 2;
		Integer f = 2;

		int g = 2;
		System.out.println(e == g);
	}
}
