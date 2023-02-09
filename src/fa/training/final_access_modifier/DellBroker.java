package fa.training.final_access_modifier;

public class DellBroker extends Broker {
	@Override
	public String policy() {
		return " buy Dell";
	}
	
	public static void main(String[] args) {
		Broker broker = new DellBroker();
		broker.advice();
		
		Integer a = new Integer(2);
		Integer b = new Integer(2);
		if (a==b) System.out.print("True"); else System.out.print("False");

	}
}
