package fa.training.string_test;

public class StringTest {
	public abstract static class Test {
		public abstract void name();
	}
	
	public class Test2 extends Test {

		@Override
		public void name() {
			System.out.println("Hello");
			
		}		
	}
	
}

