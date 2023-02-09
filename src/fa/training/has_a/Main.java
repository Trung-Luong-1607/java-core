package fa.training.has_a;

public class Main {
	public static void main(String[] args) {
		Address addr = new Address("Cẩm Thạch", "CP", "QN");
		Person ps = new Person("Trung", 16, addr);
		
		System.out.println(ps);
	}
}
