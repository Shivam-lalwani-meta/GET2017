/** 
 * @author Shivam Lalwani
 * @version 1.0
 * @Date 27 July 2017
 * @description SubMenu Class is to add new menuItems to the menu that has to be displayed on the console
 */

public class SubMenu {
	//method to add the strings in ActionableMenuItem class and add them in a list of menu class
	//So, one can add as many menuItems in a list and dd them in a list
    void SubMenuList() {
		Menu menu = new Menu();	//creating an object of menu class
		/*creating an object of ActionableMenuItem and calling parameterized constructor */
		ActionableMenuItem item1 = new ActionableMenuItem("\nPress 1 for Addition of elements into Matrix");
		menu.addMenuItem(item1);	//adding string into list of menuItem
		/*creating an object of ActionableMenuItem and calling parameterized constructor */
		ActionableMenuItem item2 = new ActionableMenuItem("Press 2 for Matrix Transpose");
		menu.addMenuItem(item2);	//adding string into list of menuItem
		/*creating an object of ActionableMenuItem and calling parameterized constructor */
		ActionableMenuItem item3 = new ActionableMenuItem("Press 3 for Multiplication");
		menu.addMenuItem(item3);	//adding string into list of menuItem
		/*creating an object of ActionableMenuItem and calling parameterized constructor */
		ActionableMenuItem item4 = new ActionableMenuItem("Press 4 to show Matrix");
		menu.addMenuItem(item4);	//adding string into list of menuItem
		/*creating an object of ActionableMenuItem and calling parameterized constructor */
		ActionableMenuItem item5 = new ActionableMenuItem("Press 5 for exit");
		menu.addMenuItem(item5); //adding string into list of menuItem
		//calling display method of menu class to display list of menu on console
		menu.display();
	}
}
