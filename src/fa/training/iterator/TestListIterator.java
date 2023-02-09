package fa.training.iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Stack;

public class TestListIterator {
	public static void main(String[] args) {
		Stack<String> listStr = new Stack<String>();
		listStr.add("A");
		listStr.add("B");
		listStr.add("C");
		listStr.add("D");
		
		System.out.println(listStr);
		
		Queue<String> listStr2 = new LinkedList<String>();
		listStr2.add("A");
		listStr2.add("B");
		listStr2.add("C");
		listStr2.add("D");
		
		listStr2.remove();
		listStr2.add("E");

		System.out.println(listStr2);
		
		
		// use for loop get element reverse to list
		for (int i = listStr.size() - 1; i >= 0; i--) {
			System.out.println(listStr.get(i));
		}
		
		System.out.println("--------------------");
		
		// use collections get element reverse to list
		Collections.reverse(listStr);
		System.out.println(listStr);
		
		System.out.println("--------------------");
		
		ListIterator<String> listItr = listStr.listIterator(listStr.size());
		
		// use ListIterator get element reverse to list
		while (listItr.hasPrevious()) {
			String e = listItr.previous();
			System.out.println(e);
		}
		
		System.out.println("--------------------");
		
		// browse in order from 0 - size length
		while (listItr.hasNext()) {
			String e = listItr.next();
			System.out.println(e);
		}
		
		System.out.println("--------------------");
		listStr.remove("B");
		System.out.println(listStr);
		
	}
}
