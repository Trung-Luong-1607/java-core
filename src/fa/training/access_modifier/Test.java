package fa.training.access_modifier;

public class Test {
	public static void main(String[] args) {
		AbsSuzuki abs = new AbsSuzuki() {

			@Override
			void Name() {
				System.out.println("Trung");
				
			}
		};
	}
	
}
