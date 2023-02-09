package fa.training.exeption;

import java.io.FileOutputStream;
import java.io.IOException;

public class ExceptionTest2 {
	   public static void main(String args[]) {
		      int num1, num2;
		      try {
		         /* Ta nghi ngờ rằng khối lệnh này sẽ throw ra
		          * exception vì vậy ta sẽ xử lý nó bằng cách đặt các câu lệnh này
		          * bên trong try block và xử lý exception trong catch block
		          */
		         num1 = 0;
		         num2 = 62 / num1;
		         System.out.println(num2);
		         System.out.println("Kết thúc try block.");
		      }
		      catch (ArithmeticException e) { 
		         /* Catch block này sẽ chỉ thực hiện nếu có ngoại lệ số học
		          * xảy ra trong try block
		          */
		         System.out.println(" Lỗi: Số bị chia không thể là số 0");
		      }
		      catch (Exception e) {
		         /* Đây là một exception chung, nó có thể xử lý
		          * tất cả các exception.Catch block này sẽ thực thi nếu ngoại lệ không
		          * được xử lý bởi catch block bên trên
		          */
		         System.out.println("Lỗi: một ngoại lệ đã xảy ra");
		      }
		      System.out.println("Ra khỏi try catch block.");
		   }
}
