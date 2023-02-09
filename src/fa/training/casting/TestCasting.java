package fa.training.casting;

public class TestCasting {
	public int age() {	
		return -1;
	}
	
	public static void main(String[] args) {
//		int number1 = 1;
//		long number4 = 15;
//		float number2 = number1;
//		double number3 = number2;
//		
//		Integer a = 1;
//		
//		float number7 = 2.956734f;
//		int number6 = (int) number7;
//		
//		System.out.println(number2);
//		System.out.println(number3);
//		System.out.println(number4);
//		System.out.println(number6);
		TestCasting ts = new TestCasting();
		System.out.println(ts.age());
		
		int numb1 = 11;
		float numb2 = numb1;
		double numb3 = 22.25;
		int numb4 = (int) numb3;
		
		System.out.println(numb2);
		System.out.println(numb4);
	}
}
