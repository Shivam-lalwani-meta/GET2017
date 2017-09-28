import java.util.ArrayList;

/**
 * Determine the layout of the calculator application.
 * 
 * @author Shivam
 */
public class Layout {
	// Set default size of calculator as 4 * 4.
	int calculatorSize[ /*numberOfRows*/ ][ /*numberOfcolumns*/ ]; 
	ArrayList<Button> buttonList;

	/**
	 * Set a layout for calculator in case of GUI where buttons and other
	 * displays can be set.
	 * 
	 * @param numberOfRows       number of rows in the calculator.
	 * @param numberOfColumns    number of columns in the calculator.
	 */
	public void setLayout(int numberOfRows, int numberOfColumns){

		Button button = new Button();
		button.setButtonPosition();
	}

	/**
	 * @return numberOfRows    number of rows in the calculator.
	 */
	public int getNumberOfRows(){

		int numberOfRows = 0;
		// Finds number of rows.
		return numberOfRows ;
	}

	/**
	 * @return numberOfColumns    number of columns in the calculator.
	 */
	public int getNumberOfColumns(){
		int numberOfColumns = 0;
		// Finds number of columns.
		return numberOfColumns ;
	}
}
