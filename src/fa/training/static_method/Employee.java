package fa.training.static_method;

public class Employee extends Person {
	static Integer number;
	int number2 = 1;
	
	public static void increate() {
		System.out.println(number + 1);
	}
	
	public void increate2() {
		System.out.println(this.number2 + 1);
	}
	
	public static void name(String firstName) {
		System.out.println(firstName);
		System.out.println("Nhung");
	}
	
	public void name() {
		System.out.println("instance method");
	}
	
	public static void name2(String firstName) {
		name("Trang");
		System.out.println(firstName);
		System.out.println("Hoa");
	}
	
	public static void main(String[] args) {
//		Employee.name2("Trung");
//		Employee emp = new Employee();
//		Employee.increate();
//		Employee.increate();
//		Employee.increate();
//		
//		emp.increate2();
//		emp.increate2();
//		emp.increate2();
		
		System.out.println(Employee.number);
	}
}
