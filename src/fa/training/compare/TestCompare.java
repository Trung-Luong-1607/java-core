package fa.training.compare;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestCompare {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Student> students = new ArrayList<>();
		
		students.add(new Student(1, "Trung", sdf.parse("26/07/1996"), 7.5));
		students.add(new Student(2, "Hoa", sdf.parse("11/12/1996"), 7.0));
		students.add(new Student(3, "Quỳnh", sdf.parse("05/06/1996"), 7.6));
		students.add(new Student(4, "Trang", sdf.parse("08/09/1996"), 6.0));
		
		// use comparable
		Collections.sort(students);
		
		for (Student student : students) {
			System.out.println(student);
		}
		
		System.out.println("------------------------------------------------------");
		
		// use comparator
		Collections.sort(students, new Comparator<Student> () {

			@Override
			public int compare(Student student1, Student student2) {
				   return ((Student) student1).getName()
	                        .compareTo(((Student) student2).getName());
			}
			
		});
		
		for (Student student : students) {
			System.out.println(student);
		}
		
		System.out.println("------------------------------------------------------");
		// use collection 
		students.sort((student1, student2) -> Double.compare(student1.getMarkAvg(), student2.getMarkAvg()));
		for (Student student : students) {
			System.out.println(student);
		}
		
		System.out.println("------------------------------------------------------");
		// use collection 
		students.sort((student1, student2) -> ((Student) student1).getName()
				.compareTo(((Student) student2).getName()));
		for (Student student : students) {
			System.out.println(student);
		}
	}
	
}
