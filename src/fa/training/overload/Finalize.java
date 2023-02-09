package fa.training.overload;

import java.io.IOException;

import javax.naming.AuthenticationException;

public class Finalize extends Person {
    public void finalize() {
        System.out.println("finalize called");
    }
 
    public static void main(String[] args) {
        Finalize f1 = new Finalize();
        Finalize f2 = new Finalize();
        f1 = null;
        f2 = null;
        System.gc();
    }

	@Override
	public int age() throws NullPointerException {
		// TODO Auto-generated method stub
		return super.age();
	}
}
