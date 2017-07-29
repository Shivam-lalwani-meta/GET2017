/** 
 * @author Shivam Lalwani
 * @version 1.0
 * @Date 27 July 2017
 */

public class ActionableMenuItem implements MenuItem {
    Action action;	// object of Action class
	String displayText;	// String  to display text in a menu
    
	//Parameterized constructor to display the Menu strings before adding them into a list
    ActionableMenuItem(String displayText) {
        this.displayText = displayText;
    }
    public void display() {
        System.out.println(displayText);
    }

    // takes the choice and performs the action
    public void takeAction(int choice,Matrix matrix,int noRows,int noCols){
	   Action action = new Action(choice);
	   action.performAction(matrix,noRows,noCols);
   }


}
