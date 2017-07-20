/**
   @author shivam
   @version 1.0
   @date 2017-07-17 
   @description Class to compute the remainder of x divided by y
    
*/
import java.util.Scanner;
public class Remainder {
		/*main method to invoke rem() and
		to take two numbers from user.*/
		public static void main(String args[]) {
			System.out.print("Enter values of x and y");
			Scanner sc = new Scanner(System.in);	//Scanner class for dynamic approach
			int x = sc.nextInt();
			int y = sc.nextInt();
			if(x <= 0 || y <= 0) {
				System.out.print("Both numbers should be greater than 0");
				System.exit(0);
			}
			int remainder = rem(x,y);
			System.out.print(+remainder);
			sc.close();	//closing object of Scanner class
		}
		/**
		 * 
		 * @param x, first number
		 * @param y, second number
		 * @return , remainder
		 */
		public static int rem(int x, int y) {
			if(y==0) {
				throw new ArithmeticException(); //exception divide by zero
			}
			if(x>y) {
				x-=y;
				return rem(x,y);
			}
			else return x;
		}		
}
