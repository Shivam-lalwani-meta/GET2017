/** 
 * @author Shivam Lalwani
 * @version 1.0
 * @Date 27 July 2017
 * @description MenuItem is an interface that is implemented by ActionableMenuItem.
 */

public interface MenuItem {
	public void display();
	public void takeAction(int i,Matrix matrix,int noRows,int noCols);
}
