package fa.training.access_modifier;

public abstract class MotoBike {
	private void name(String name1, String name2) {
		System.out.println(name1 + " " + name2);
	}
	
	private void name(String name) {
		System.out.println(name);
	}
	
	 void name() {
		System.out.println("Hello");
	}
	
	abstract void v();
}


