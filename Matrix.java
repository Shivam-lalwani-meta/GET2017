/** 
 * @author Shivam Lalwani
 * @version 1.0
 * @Date 27 July 2017
 * @description The Class Matrix created to perform different functionalities of a Matrix
 */

public class Matrix {
	protected int data[][];	//The data which is used to store the matrix
	private int noRows;	//number of rows
	private int noCols;	//number of columns
	
	//Parameterized constructor
	public Matrix(int noRows, int noCols) {
		this.noRows = noRows;
		this.noCols = noCols;
		data = new int[noRows][noCols];
	}
	
	/**
	 * Getter method to get value of private variable data.
	 * @return 2-D integer array
	 */
	public int[][] getData() {
		return data;
	}
	
	/**
	 * @param noRows, row at which the data is to be inserted
	 * @param noCols, column at which the data is to be inserted
	 * @param val, data value which has to be inserted
	 */
	public void addElements(int noRows, int noCols, int val) {
		data[noRows][noCols] = val;
	}

	/**
	 * @return the transposed matrix
	 */
	public Matrix transpose() {
		Matrix trans = new Matrix(noCols, noRows);
		for (int row_index = 0; row_index < trans.noRows; row_index++) {
			for (int col_index = 0; col_index < trans.noCols; col_index++) {
				trans.data[row_index][col_index] = data[col_index][row_index];
			}
		}
		return trans;
	}

	//to display matrix on console
	public void show() {
		for (int row_index = 0; row_index < noRows; row_index++) {
			for (int col_index = 0; col_index < noCols; col_index++) {
				System.out.print(data[row_index][col_index] + " ");
			}
			System.out.println();
		}
	}

	/**
	 * Multiplication.
	 *
	 * @return the matrix
	 */
	public Matrix multiplication(Matrix secondMatrix) {
		Matrix resultMatrix = new Matrix(noRows, noCols);
		if(secondMatrix.noRows == noCols){
			for (int row_index = 0; row_index < noRows; row_index++) {
				for (int col_index = 0;col_index < noCols; col_index++) {
					for (int k = 0; k < noCols; k++) {
						resultMatrix.data[row_index][col_index] = resultMatrix.data[row_index][col_index]
								+ data[row_index][k] * secondMatrix.data[k][col_index];
					}
				}
			}
		return resultMatrix;
			}
		else {
			return this;
		}
	}
}
