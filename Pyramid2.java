//program to print a Pyramid
import java.util.Scanner;

public class Pyramid2 {
		public static void main(String args[]) {
			
			int row = 2;
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
				
					for(int count = 1; count <= space; count++) {
						row=row-1;
						for(int innerLoop = 1 ; innerLoop < count ; innerLoop++) {
							System.out.print(" ");  //to print spaces
						}
						
						
						int n= no(row, number);
					
						for(j = 1; j< n+space; j++){
							System.out.print(+j);  //to print numbers on pyramid
							
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
