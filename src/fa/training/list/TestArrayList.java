package fa.training.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestArrayList {
	public static void main(String[] args) {
		List<String> listStr = new ArrayList<String>();
		listStr.add("HONDA");
		listStr.add("YAMAHA");
		listStr.add("SUZUKI");
		listStr.add("WAVE");
		listStr.add("JUPITER");
		
		List<String> listStr2 = new ArrayList<String>();
		listStr2.add("HONDA");
		listStr2.add("YAMAHA");
		listStr2.add("SUZUKI");
		
		listStr.addAll(listStr2);
		listStr.sort(new Comparator<String>() {

			@Override
			public int compare(String str1, String str2) {
				return str1.compareTo(str2);
			}
			
		});

		System.out.println(listStr);
		System.out.println(listStr.lastIndexOf("HONDA"));
		
	}
}
