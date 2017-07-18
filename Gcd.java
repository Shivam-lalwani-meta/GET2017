/**
   @author shivam
   @version 1.0
   @date 2017-07-17 
   @description Class will find out the HCF/GCD of the number using gcd_calculate() method
    
*/

import java.util.Scanner;
public class Gcd {
	/*main method to invoke gcd_calculate() and
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
		int hcf = gcd_calculate(x,y);	//invoking gcd_calculate
		System.out.print(+hcf);
		sc.close();	//closing object of Scanner class
	}
	
	/**
	 * 
	 * @param x , first number entered by user
	 * @param y , second number entered by user
	 * @return , gcd
	 */
	public static int gcd_calculate(int x, int y) {
		//condition to check the first parameter on next call should be greater
		if(x<y) {
			return gcd_calculate(y,x);
		}
		//condition to check if second number is 0 or not
		if(y==0) {
			return x;
		}
		else {
			return gcd_calculate(y,x%y);
		}
	}	
}
