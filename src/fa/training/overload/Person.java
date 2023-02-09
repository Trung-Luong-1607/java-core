package fa.training.overload;

import java.io.IOException;

public class Person {
	int age = 17;
	
	public int age()  {
		return age;		
	}
	
	public int age(int a, int b) {
		return age;		
	}
	
	protected int age(int a) {
		return age;		
	}
	
	protected float age(float a) {
		return age;		
	}
	
	public static void main(String[] args) {
		Person ps = new Person();
		
		System.out.println(ps.age(1));
	}
}
