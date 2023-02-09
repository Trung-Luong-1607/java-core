package fa.training.static_method;

public class Person {
	public static void name(String firstName) {
		System.out.println(firstName);
		System.out.println("Hà");
	}

	public static void name(String firstName, String lastName) {
		System.out.println(firstName + " " + lastName);
	}
	
	public void finalize() {
		System.out.println("Object is destroyed");
	}
	
	public static void main(String[] args) {
//		Person.name("Lương");
//		Person.name("Lương","Trung");
		
		Person person1 = new Person();
		Person person2 = new Person();
		
		person1 = person2;
		
		System.gc();
	}
}
