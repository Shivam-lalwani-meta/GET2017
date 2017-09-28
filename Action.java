/** 
 * @author Shivam Lalwani
 * @version 1.0
 * @Date 27 July 2017
 * @description Class Action is called by ActionableMenuItem, and get choice of a user,
 * matrix object, number of rows and number of column entered by user.
 */
import java.util.Scanner;

public class Action {
	private int choice;	//variable to hold choice
	//Parameterized constructor
	Action(int choice) {
		this.choice = choice;
	}
	/**
	 * 
	 * @param matrix, object of matrix class
	 * @param noRows, no of rows entered by user
	 * @param noCols, no of columns entered by user
	 */
	public void performAction(Matrix matrix,int noRows,int noCols) {
		Scanner sc = new Scanner(System.in);
		//choose which action would be performed using switch case
		switch (choice) {
			case 1: {
				System.out.println("Enter values to be added to Matrix");
				for (int row_index = 0; row_index < noRows; row_index++) {
					for (int col_index = 0; col_index < noCols; col_index++) {
						matrix.addElements(row_index, col_index, sc.nextInt());
					}
				}
				break;
			}
			case 2: {
				Matrix transposed = matrix.transpose();
				System.out.println("transpose of matrix is:");
				transposed.show();
				break;
			}
			case 3: {
				System.out.println("Enter the row and column for second Matrix");
				int noRow = sc.nextInt();
				int noCol = sc.nextInt();
				Matrix secondMatrix = new Matrix(noRow,noCol);
				System.out.println("Enter values of Matrix to be multiplied with ");
				for (int row_index = 0; row_index < noRows; row_index++) {
					for (int col_index = 0; col_index < noCols; col_index++) {
						secondMatrix.addElements(row_index, col_index, sc.nextInt());
					}
				}
				Matrix multiplied = matrix.multiplication(secondMatrix);
				System.out.println("After multiplication of matrix is:");
				multiplied.show();
				break;
			}
			case 4: {
				matrix.show();
				break;
			}
			case 5: {
				System.exit(0);
			}
		}
	}
}
