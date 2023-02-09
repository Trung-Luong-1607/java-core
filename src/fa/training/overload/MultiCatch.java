package fa.training.overload;

public class MultiCatch {
	public static void main(String[] args) {
//	     try{
//	         int a[]=new int[7];
////	         a[4]=30/0;
//	         a[10] = 27;
//	         System.out.println("Câu lệnh in đầu tiên trong try block");
//	     }
//	     catch(ArithmeticException e){
//	        System.out.println("Cảnh báo: ngoại lệ ArithmeticException");
//	     }
//	     catch(ArrayIndexOutOfBoundsException e){
//	        System.out.println("Cảnh báo: ngoại lệ ArrayIndexOutOfBoundsException");
//	     }
//	     catch(Exception e){
//	        System.out.println("Cảnh báo: ngoại lệ khác");
//	     }
//	   System.out.println("Ra khỏi try-catch block...");
		
		try {
			   //try block
			   System.out.println("Bên trong try block");
			   System.exit(0);
			}
			catch (Exception exp) {
			   System.out.println(exp);
			}
			finally {
			   System.out.println("Bên trong finally block");
			}
	}
}
