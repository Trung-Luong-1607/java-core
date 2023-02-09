package fa.training.hust;

public class Test {
	String s1 = "A";
	String s2 = "B";
	
	public void foo(String a, String b) {
		String _temp = a;
		a = b;
		b = _temp;
	}
	
	public Test(int a) {
		foo(s1, s2);
		System.out.println("Int " + s1 + s2);
	}
	
	public Test(String a) {
		foo(s1, s2);
		System.out.println("String " + s1 + s2);
	}
	
	public static void main(String[] args) {
		Test t = new Test("C");
		System.out.println(t);
	}
}
