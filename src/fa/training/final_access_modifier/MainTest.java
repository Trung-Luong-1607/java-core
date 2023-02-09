package fa.training.final_access_modifier;

public class MainTest {
	public static void main(String[] args) {
		Magazine mg = new Magazine("Playboy", 50000);
		Magazine mg1 = new Magazine("CNN", 50000);
		
		mg = mg1;
		Magazine mg2 = new Magazine("BBC", 50000);
		mg2 = null;
		
		System.gc();
	}
}
