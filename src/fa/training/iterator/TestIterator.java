package fa.training.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestIterator {
	static List<Integer> listNumber = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		TestIterator.listNumber.add(1);
		TestIterator.listNumber.add(2);
		TestIterator.listNumber.add(3);
		TestIterator.listNumber.add(4);
		TestIterator.listNumber.add(5);
		
		List<String> listStr = new ArrayList<String>();
		listStr.add("A");
		listStr.add("B");
		listStr.add("C");
		listStr.add("D");
		
		// use for loop
		System.out.println("use for loop :");
		for (int i = 0; i < TestIterator.listNumber.size(); i++) {
			System.out.println(TestIterator.listNumber.get(i));			
		}
		
		// use foreach
		System.out.println("use for each :");
		for (Integer element : TestIterator.listNumber) {
			System.out.println(element);
		}
		
		// use iterator
		System.out.println("use iterator :");
		Iterator<Integer> iterator = TestIterator.listNumber.iterator();
		Iterator<String> iterator2 = listStr.iterator();
		
		while (iterator.hasNext()) {
			Integer element = iterator.next();
	
			System.out.println(element);
		}
		
		// remove element in iterator
		System.out.println("remove element in iterator :");
		while (iterator2.hasNext()) {
			String element = iterator2.next();
			
			if (element.equals("A")) {
				iterator2.remove();
				break;
			}
		}
		
		for (String e : listStr) {
			System.out.println(e);
		}
		
	}
}
