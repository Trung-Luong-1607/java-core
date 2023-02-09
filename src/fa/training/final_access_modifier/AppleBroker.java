package fa.training.final_access_modifier;

public class AppleBroker extends Broker {

	@Override
	public String policy() {
		return " buy Apple";
	}
	
	public static void main(String[] args) {
		Broker broker = new AppleBroker();
		broker.advice();
	}
	
}
