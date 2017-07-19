/*Binary to Octal
  program
*/

import java.util.Scanner;

public class Convertor {
 public static int convertBinaryToOctal(int n) //funtion to convert binary to octal
 {
	int check = n;
	int digit=0;
	while(check!=0)							//to check input should be greater than o
	{
		digit=check%10;
		if(digit!=0&&digit!=1)					//to check wheather the number entered is binary or not
		{
			System.out.println("Please Enter Binary");
			System.exit(0);
		}
		check =check/10;
	}
	 int binary=n;
	 double decimal=0,power=0;
	 while(binary!=0)
	 {
		 decimal+=((binary%10)*(Math.pow(2, power)));			//binary to decimal conversion
		 binary=binary/10;
		 power++;
	 }
	int octal=0;
	int count =1;
	int rem=0;
	while(decimal!=0)
	{
		rem = (int)decimal%8;									//decimal to octal conversion
		octal=(rem*count)+octal;
		decimal=decimal/8;
		count*=10;
	}
 return octal;
 }
 
	public static void main(String args[]){
		
		int n,octal;
		System.out.println("Ã‹nter binary number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		octal=convertBinaryToOctal(n);
		System.out.println(+octal);
	}
 
}
