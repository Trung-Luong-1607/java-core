package fa.training.instance_method;

import java.util.List;
import java.util.Stack;

public class Car {
	float a;

	public void name() {
		System.out.println(a);
	}

	public static void main(String[] args) {
		Car car = new Car();
		car.name();
		List<Integer> list = new Stack<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		list.remove(4);
		
		System.out.println(list);
	}
}
