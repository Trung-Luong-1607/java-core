package fa.training.final_access_modifier;

/*
 * Complier error because not extends final class (class imutable) 
 */
//public class Book extends Library {
//
//}

public class Book extends Library {

	@Override
	public double price() {
		// TODO Auto-generated method stub
		return 0;
	}

	// Complier error because not overide final method
//	public final void name() {
//		
//	}
	
	public static void main(String[] args) {
		Book book = new Book();
		book.getNAME();
	}

}

//Complier error because not use final interface
//final interface Books {
//	
//}

abstract interface Books {

}
