// program to print pyramid
import java.util.Scanner;

public class Pyramid {
		public static void main(String args[]) {
			
			int row = 0;
			System.out.print("Enter the number");
			Scanner sc = new Scanner(System.in);
			int number = sc.nextInt();
			pyramidMethod(row, number); 
			sc.close();
			
		}
		
		public static void pyramidMethod(int row, int number) {
			
			
				int j;
				//method call to get number of spaces to be print on a particular row
				int space = space(row, number);
				
					//to print half pyramid
					for(int count = space; count >= 1; count--) {
						row=row+1;
						for(int innerLoop = 1 ; innerLoop < count ; innerLoop++) {
							System.out.print(" ");
						}
						
						//method call to access specific number
						int n= no(row, number);
						
						//to print left-half upper part
						for(j = 1; j<= n; j++){
							System.out.print(+j);
							
					    }
						
						//to print right-half upper part
						for(int k = j-2; k > 0; k--){
							System.out.print(+k);
						}
						System.out.print("\n");
						
					}
					
					//to print half pyramid
					for(int count = 2; count <= space; count++) {
						row=row-1;
						for(int innerLoop = 1 ; innerLoop < count ; innerLoop++) {
							System.out.print(" ");
						}
						
						//method call to access specific number
						int n= no(row, number);
						
						//to print left-half upper part
						for(j = 1; j<= n; j++){
							System.out.print(+j);
							
					    }
						
						//to print right-half upper part
						for(int k = j-2; k > 0; k--){
							System.out.print(+k);
						}
						System.out.print("\n");
						
					}
						
		}
		
		//method to return number of spaces
		public static int space(int row, int number) {
			
			return number--;
		}
		
		//method to return number
		public static int no(int row, int number){
			
			
			return row;
		}
		
		
		
		
}
