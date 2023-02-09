package fa.training.inheritance;

public class DogChild extends Dog implements IA,IB,IC {

	




	public static void main(String[] args) {
		Animal dog = new DogChild();
		DogChild dog2 = new DogChild();
		dog2.name();
	}

	@Override
	public void name() {
		// TODO Auto-generated method stub
		IA.super.name();
	}



}
