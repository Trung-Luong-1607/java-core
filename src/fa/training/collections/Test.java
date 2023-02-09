package fa.training.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Test {
	int[] array = {8, 7, 9, 11, 8, 11, 20, 15, 7};
	
	public static void main(String[] args) {
		Set<Integer> s = new TreeSet<>();
		s.add(8);
		s.add(7);
		s.add(9);
		s.add(11);
		s.add(8);
		s.add(11);
		s.add(20);
		s.add(15);
		s.add(7);
		
		System.out.println(s);
		System.out.println(s.size());
		
//        List<Integer> intList = new LinkedList<>();
//        List<Double> dblList = new LinkedList<>();
		List<Integer> intList = new LinkedList<>();
		List<Double> dblList = new LinkedList<>();
        System.out.println("First type: " + intList.getClass());
        System.out.println("Second type:" + dblList.getClass());
        
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
      
	}
}
