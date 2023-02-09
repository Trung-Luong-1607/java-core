package fa.training.function_interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MainTest {
	public static void main(String[] args) {
		IPerimeter retanggle = (double height, double width) -> (height + width) * 2;
		double result = retanggle.perimeter(10, 5);
		System.out.println(result);
		
		Predicate<String> checkS = (String s) -> s.equals("A");
		boolean check = checkS.test("B");
		System.out.println(check);
		
		List<String> names = Arrays.asList("Angela", "Aaron", "Bob", "Claire", "David");
		 
		List<String> namesWithA = names.stream()
		  .filter(name -> name.startsWith("A"))
		  .collect(Collectors.toList());
		
		System.out.println(namesWithA);
		  
	}	
}


