package fa.training.exeption;

public class ExeptionTest {
	 
//     public static void main(String[] args) {
//    	 try {
//    		 int[] myNumbers = {1, 2, 3};
//    		 System.out.println(myNumbers[5]);
//		} catch (Exception e) {
//			System.out.println("Có lỗi xảy ra");
//		}
    	 
//		 int[] myNumbers = {1, 2, 3};
//		 System.out.println(myNumbers[5]);
//    	 throw new IndexOutOfBoundsException("Có lỗi xảy ra");
    	 
//	}
	
    //function to check if person is eligible to vote or not   
    public static void validate(int age) throws ArithmeticException {  
//        if(age<18) {  
////            throw Arithmetic exception if not eligible to vote  
//            throw new ArithmeticException("Person is not eligible to vote");    
//        }  
//        else {  
//            System.out.println("Person is eligible to vote!!");  
//        }  
    	try {
//			if (age>18) {
//				System.out.println("\"Person is eligible to vote\"");
//			}
    		int i = 1/0;
    		System.out.println(i);
    		int j = 2;
    		j = 3;
    		

		} 
//    	catch (ArithmeticException e) {
//			System.out.println("Error");
//		}
    	
//    	catch (Exception e) {
//			// TODO: handle exception
//		}	
    	
    	finally {
			System.out.println("Exit");
			System.gc();
		}
    }  
    //main method  
    public static void main(String args[]){  
        //calling the function  
        validate(13);  
        System.out.println("rest of the code...");    
  } 
}
