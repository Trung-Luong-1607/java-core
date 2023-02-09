package fa.training.multiple_thread;

public class Person extends Thread {
//implements Runnable 
	private String personName;
	private int age;
	private String address;

	public Person(String personName, int age, String address) {
		this.personName = personName;
		this.age = age;
		this.address = address;
	}
	

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println("Person [name=" + personName + ", age=" + age + ", address=" + address + "]");
			
		}	
	}
}
