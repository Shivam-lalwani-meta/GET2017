/**
   @author shivam
   @version 1.0
   @date 2017-07-17 
   @description Class will find out largest digit in a number
    
*/
import java.util.Scanner;

public class Largestdigit {
	/*main method to invoke largeDigit() and
	to take number from user.*/
	public static void main(String args[]) {
		System.out.print("Enter a number");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int n = largeDigit(number);
		System.out.print(+n);
		sc.close();
	}
	/**
	 * 	
	 * @param number , the number entered by user
	 * @return the largest digit of a number
	 */
	public static int largeDigit(int number) {
		if(number>0) {
			return Math.max(number%10, largeDigit(number /10));
		} else {
			return number;
		}
	}	
}