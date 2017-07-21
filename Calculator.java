/**
 * Class for calculator applications.
 * @author Shivam
 */
public class Calculator {
	double operand1;
	double operand2;
	char operator;
	char newOperator;
	Operator operation;

	public void getInput(String input) {
		this.calculate();
		// Handles all the exceptions if expression is invalid.
	}

	public void calculate(){
		/* Check for operator and call appropriate method from operator 
		 * class and store the result in operator variable.
		 */
		this.setOutput();
		operator = newOperator;

	}

	public void setOutput() {
		// Sets the output to be displayed.
		new Display(this.operand1);
		new Display(this.operand2);
		new Display(this.operator);
		new Display(this.newOperator);
	}
}
